// Make a function to add 2 numbers and return sum

import java.util.Scanner;

public class function {

    public static int numSum(int a, int b){
        int sum=a+b;
        System.out.println("Sum of "+a+ " and " +b+ " is " +sum);
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of a:");
        int a = sc.nextInt();
        System.out.print("Enter the value of b:");
        int b = sc.nextInt();
        numSum(a, b);

    }
}
