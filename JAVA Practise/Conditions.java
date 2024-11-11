import java.util.Scanner;
public class Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int button = sc.nextInt();
        // int num1 = sc.nextInt();
        // int num2 = sc.nextInt();

        // if(num1==num2){
        //     System.out.println("Equal");
        // }
        // else if(num1>num2){
        //     System.out.println("num1 is Greater");
        // }
        // else{
        //     System.out.println("num1 is lesser");
        // }


        switch(button){
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3: System.out.println("Wata Shiwa");
            break;
            default: System.out.println("Invalid Button used");
        }
        
    }
}
