import java.util.Scanner;

public class arrayPrep {
    public static void main(String[] args) {
        //Take an array of names as input from the user and print them on the screen.
        
        Scanner sc = new Scanner(System.in);
        System.out.println("How many name do you want to enter?");
        int size = sc.nextInt();
        // int[] marks = new marks[size];
        String name[] = new String[size];

        for(int i=0;i<size;i++){
            System.out.print("Enter the name of "+(i+1)+" person:");
            name[i] = sc.next();
        }

        for(int i=0;i<size;i++){
            System.out.print("Name of "+(i+1)+" person that you have entered is "+name[i]);

        }
    }
}
