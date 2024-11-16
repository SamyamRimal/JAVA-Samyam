import java.util.Scanner;
public class learningArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        int size = sc.nextInt();
        int[] marks = new int[size];
        String[] subject = new String[size];

        for(int i=0;i<size;i++){
            System.out.print("Enter the name of subject:");
            subject[i] = sc.next();
        }
        for(int i=0;i<size;i++){
            System.out.print("Enter the makes of "+subject[i]+" :");
            marks[i] = sc.nextInt();
    }
    

    int totalObtMarks = marks[0]+ marks[1]+ marks[2]+ marks[3]+ marks[4];
    int totalMarks = 500;
    double percentage = (totalObtMarks*100)/totalMarks;

    System.out.println("Your percentage is"+percentage);

    
}
}
