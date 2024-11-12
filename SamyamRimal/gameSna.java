package SamyamRimal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class gameSna extends JFrame {
    private static final int WINDOW_WIDTH = 600;
    private static final int WINDOW_HEIGHT = 600;
    private static final int UNIT_SIZE = 20;
    private static final int GAME_UNITS = (WINDOW_WIDTH * WINDOW_HEIGHT) / (UNIT_SIZE * UNIT_SIZE);
    private static final int DELAY = 100;

    private final int[] x = new int[GAME_UNITS];
    private final int[] y = new int[GAME_UNITS];
    private int bodyParts = 3;
    private int foodEaten;
    private int foodX;
    private int foodY;
    private char direction = 'R';
    private boolean running = false;
    private Timer timer;
    private Random random;

    public SnakeGame() {
        random = new Random();
        this.setTitle("Snake Game");
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.add(new GamePanel());
        this.setVisible(true);
    }

    public class GamePanel extends JPanel implements ActionListener {
        public GamePanel() {
            this.setPreferredSize(new Dimension(WINDOW_WIDTH, WINDOW_HEIGHT));
            this.setBackground(Color.black);
            this.setFocusable(true);
            this.addKeyListener(new MyKeyAdapter());
            startGame();
        }

        public void startGame() {
            spawnFood();
            running = true;
            timer = new Timer(DELAY, this);
            timer.start();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            draw(g);
        }

        public void draw(Graphics g) {
            if (running) {
                g.setColor(Color.red);
                g.fillOval(foodX, foodY, UNIT_SIZE, UNIT_SIZE);

                for (int i = 0; i < bodyParts; i++) {
                    if (i == 0) {
                        g.setColor(Color.green);
                    } else {
                        g.setColor(new Color(45, 180, 0));
                    }
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                }

                g.setColor(Color.white);
                g.setFont(new Font("Ink Free", Font.BOLD, 25));
                FontMetrics metrics = getFontMetrics(g.getFont());
                g.drawString("Score: " + foodEaten, (WINDOW_WIDTH - metrics.stringWidth("Score: " + foodEaten)) / 2, g.getFont().getSize());
            } else {
                gameOver(g);
            }
        }

        public void spawnFood() {
            foodX = random.nextInt((int) (WINDOW_WIDTH / UNIT_SIZE)) * UNIT_SIZE;
            foodY = random.nextInt((int) (WINDOW_HEIGHT / UNIT_SIZE)) * UNIT_SIZE;
        }

        public void move() {
            for (int i = bodyParts; i > 0; i--) {
                x[i] = x[i - 1];
                y[i] = y[i - 1];
            }

            switch (direction) {
                case 'U':
                    y[0] = y[0] - UNIT_SIZE;
                    break;
                case 'D':
                    y[0] = y[0] + UNIT_SIZE;
                    break;
                case 'L':
                    x[0] = x[0] - UNIT_SIZE;
                    break;
                case 'R':
                    x[0] = x[0] + UNIT_SIZE;
                    break;
            }
        }

        public void checkFood() {
            if ((x[0] == foodX) && (y[0] == foodY)) {
                bodyParts++;
                foodEaten++;
                spawnFood();
            }
        }

        public void checkCollisions() {
            // Check if head collides with body
            for (int i = bodyParts; i > 0; i--) {
                if ((x[0] == x[i]) && (y[0] == y[i])) {
                    running = false;
                }
            }

            // Check if head touches left border
            if (x[0] < 0) {
                running = false;
            }

            // Check if head touches right border
            if (x[0] >= WINDOW_WIDTH) {
                running = false;
            }

            // Check if head touches top border
            if (y[0] < 0) {
                running = false;
            }

            // Check if head touches bottom border
            if (y[0] >= WINDOW_HEIGHT) {
                running = false;
            }

            if (!running) {
                timer.stop();
            }
        }

        public void gameOver(Graphics g) {
            g.setColor(Color.red);
            g.setFont(new Font("Ink Free", Font.BOLD, 50));
            FontMetrics metrics = getFontMetrics(g.getFont());
            g.drawString("Game Over", (WINDOW_WIDTH - metrics.stringWidth("Game Over")) / 2, WINDOW_HEIGHT / 2);

            g.setColor(Color.white);
            g.setFont(new Font("Ink Free", Font.BOLD, 25));
            g.drawString("Score: " + foodEaten, (WINDOW_WIDTH - metrics.stringWidth("Score: " + foodEaten)) / 2, g.getFont().getSize());
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (running) {
                move();
                checkFood();
                checkCollisions();
            }
            repaint();
        }

        private class MyKeyAdapter extends KeyAdapter {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        if (direction != 'R') {
                            direction = 'L';
                        }
                        break;
                    case KeyEvent.VK_RIGHT:
                        if (direction != 'L') {
                            direction = 'R';
                        }
                        break;
                    case KeyEvent.VK_UP:
                        if (direction != 'D') {
                            direction = 'U';
                        }
                        break;
                    case KeyEvent.VK_DOWN:
                        if (direction != 'U') {
                            direction = 'D';
                        }
                        break;
                }
            }
        }
    }

    public static void main(String[] args) {
        new SnakeGame();
    }
}


