import java.util.Arrays;

public class ArraySortSearch {
    public static void main(String[] args) {
        int[] numbers = {30, 10, 50, 40, 20};

        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        int index = Arrays.binarySearch(numbers, 30);
        System.out.println("Index of 30: " + index);
    }
}
