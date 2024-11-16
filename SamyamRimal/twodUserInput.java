// Take a matrix as input from the user. Search for a given number 8 and print the indicated at wich it occurs.
import java.util.Scanner;
public class twodUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns:");
        int columns = sc.nextInt();

        int [][] matrix = new int[rows][columns];
        System.out.println("Enter the elements of the matrix:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("The matrix the you have entered is:");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter the number thet you want to search:");
        int search = sc.nextInt();
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                if(matrix[i][j]== search) {
                    System.out.println("The number " + search + " is found at position (" + i +" ," + j + ")");
                }
            }
    
        }

    }
}
