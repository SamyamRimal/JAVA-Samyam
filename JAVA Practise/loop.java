// Loops
import java.util.Scanner;
public class loop {
    public static void main(String[] args) {
        // for(int i=0;i<5;i++){
        //     System.out.println("Hello World");
        // }

        // Print the Numbers from 0 to 10
        // for(int i=0;i<11;i++){
        //     System.out.print(i+" ");
        // }

        // While Loop
        // int i=0;
        // while(i<11){
        //     System.out.println(i+" ");
        //     i++;
        // }


        //Do while Loop
        // int i=0;
        // do{
        //     System.out.print(i+" ");
        //     i++;
        // }while(i<11);

        //Print the sum of First n natural numbers
        // int n=4;
        // int sum=0;
        // for(int i=1; i<=n;i++){
            
        //     sum+=i;
        // }
        // System.out.println(sum);

        //Print the table of number input by user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number that you want table of:");
        int n=sc.nextInt();
        int mult=1;
        for(int i=1;i<11;i++){
            mult=n*i;
            System.out.println(mult);
        }
        
    }
}
