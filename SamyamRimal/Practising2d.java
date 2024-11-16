//Write a program to calculate the sum of all elements in a given 2D array.
import java.util.Scanner;
public class Practising2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matAdd = new int[3][3];
        int sum = 0;
        System.out.print("Enter the elements in the 3x3 matrix:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matAdd[i][j] = sc.nextInt();
            }
        }
        System.out.println("Elements of 3x3 martix are:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(matAdd[j][i]+ " "); // In order to transpose the matrix you have to change the position of i and j.
            }
            System.out.println();
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sum += matAdd[i][j];
            }
        }
        System.out.println("The sum of elements of 3x3 matrix is : "+sum);
    }
    
}
