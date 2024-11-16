import java.util.Scanner;
public class twoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns:");
        int cols = sc.nextInt();

        int [][] matrix = new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0; j<cols;j++){
                matrix [i][j] = sc.nextInt();
            }
        }
        System.out.println("The matrix that you have given is :");
        for(int i=0;i<rows;i++){
            for(int j=0; j<cols;j++){
                
                System.out.print(matrix [i][j] + " ");
            }
            System.out.println();
        }
    }
}
