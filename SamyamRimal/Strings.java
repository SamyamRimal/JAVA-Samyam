import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println(name.length()); // To find the length we use the function length();

        //To print the levvers one by one we use the function CharAt(i)
        for(int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }
        
    }
}
