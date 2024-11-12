import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of a:");
        int a = sc.nextInt(); 
        System.out.println("Enter Value of b:");
        int b = sc.nextInt();

        System.out.println("1. Add\n2. Subtract\n 3. Multiply\n 4. Divide");
        int symbols = sc.nextInt();

        switch(symbols){
            case 1: System.out.println(a + b);
            break;
            case 2: System.out.println(a - b);
            break;
            case 3: System.out.println(a * b);
            break;
            case 4: System.out.println(a/b);
            break;
            default: System.out.println("Invalid");
        }
    }
}
