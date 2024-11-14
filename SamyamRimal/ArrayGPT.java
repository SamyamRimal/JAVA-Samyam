import java.util.Scanner;
//Create an array that can store 4 names. Assign the names "Alice," "Bob," "Charlie," and "Diana" to the array. Then, retrieve and print the second name in the array.
public class ArrayGPT {
    public static void main(String[] args) {
        
        
        System.out.print("Enter the number of names you want to enter:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String name[] = new String[size];

        for(int i=0;i<size;i++){
            System.out.print("Enter the name of "+(i+1)+" person");
            name[i] = sc.next();

        }
        for(int i=0; i<size;i++){
            System.out.println(name[i]);
        }
    }
}
