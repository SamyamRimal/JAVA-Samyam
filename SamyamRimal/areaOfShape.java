//WAP that calculates the area of a circle, triangle, and rectangle based on user input
import java.util.Scanner;
public class areaOfShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.println("1. Area of Circle \n 2. Area of Triangle \n 3. Area of Rectangle");
       System.out.println("Select your choice");
       int a = sc.nextInt();
       if(a==1){
        System.out.println("--For area of Circle--");
        System.out.println("Enter the radius of circle");
        int r = sc.nextInt();
        double result = 3.14*r*r;
        System.out.println(result);
       }
       else if(a==2){
        System.out.println("--For area of triangle--");
        System.out.println("Enter the base of triangle:");
        int b = sc.nextInt();
        System.out.println("Enter the height of triangle");
        int h = sc.nextInt();
        double result = 0.5*b*h;
        System.out.println(result);
       }
       else if(a==3){
        System.out.println("--For area of rectangle--");
        System.out.println("Enter the lengthe of rectangle:");
        int l = sc.nextInt();

        System.out.println("Enter the width of rectangle:");
        int w = sc.nextInt();

        int result = l*w;
        System.out.println(result);
       }
       else{
        System.out.println("Invalid Choice");
       }
    }
}
