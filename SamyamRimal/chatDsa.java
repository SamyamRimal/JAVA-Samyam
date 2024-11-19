public class chatDsa {
    public static void main(String[] args) {
        // int[] arr = {5, 10, 15, 20, 25};
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }

        // arr[3] = 35;
        // System.out.println("After changing the value of arr[3]");
        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }



        // int[] arr = {2, 4, 6, 8, 10, 12};
        // int sum = 0;
        // int num = 8;
        // int largest =arr[0];
        // int smallest=arr[0];
        // for (int i = 0; i < arr.length; i++) {
        //     sum+=arr[i];
        // }
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==num){
        //         System.out.println(num+" is present at index "+i);
        //     }
           
        // }
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>largest){
        //     largest=arr[i];
            
        //     }
        //     if(arr[i]<smallest){
        //         smallest=arr[i];
        //     }

            

        // }
        // System.out.println("Largest number in array is "+largest);
        // System.out.println("Smallest number in array is "+smallest);
        // System.out.println("Sum of all the elements of array is: "+sum);



        // Rotate array using shift operator
        int[] arr = {1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        for(int i=0;i<2;i++){
            rotation(arr);
        }
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }

        }
        public static void rotation(int[] arr){
            int first = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                    arr[i] = arr[i + 1]; 
            }
            arr[arr.length -1] = first;
        }
    }   
       

