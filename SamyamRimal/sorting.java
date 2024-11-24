import java.util.Scanner;
public class sorting {
    public static void main(String[] args) {
        int[] arr ={64, 34, 25, 12, 22, 11, 90};
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                
            }
        }
    }
}
