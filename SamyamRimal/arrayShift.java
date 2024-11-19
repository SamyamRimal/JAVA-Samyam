public class arrayShift {
    public static void main(String[] args) {
    //     int[] arr = {1, 2, 3, 4, 5};
    //     System.out.println("Original Array: ");
    //     for(int i=0; i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    //     System.out.println();
    //     for(int i=0;i<2;i++){
    //         rightSift(arr);
    //     }
    //     for(int i=0; i<arr.length;i++){
    //         System.out.print(arr[i]+" ");
    //     }
    // }
    
    // public static void rightSift(int[] arr){
    //     int last = arr[arr.length - 1];
    //     for(int i=arr.length - 1; i>0 ;i--){
    //         arr[i] = arr[i-1];
    //     }
    //     arr[0] = last;


    int[] arr = {1, 2, 3, 4, 5};
    System.out.println("Original Array: ");
    for(int i=0; i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();

    for(int i = 0; i<2;i++){
        leftShift(arr);
    }
    System.out.println("Rotated Array:");
    for(int i=0; i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    }
    public static void leftShift(int[] arr){
        int first = arr[0];
        for(int i=0; i<arr.length - 1;i++){
            arr[i] = arr[i+1]; // Yesle 1 ko thau ma 2 rakhxa and 2 ko thau ma 3 rakhxa (2,3,4,5)
        }
        arr[arr.length - 1] = first; // last ko thau ma first rakh (2,3,4,5,1)
    }
}
