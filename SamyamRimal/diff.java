import java.util.Scanner;
public class diff {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //Difference of two number asking from user
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        int c = a - b;
        System.out.println("Difference of two number is " + c);
    }
}
