import java.util.Scanner;

public class apnaClzExercise {
    //Enter 3 numbers from the user & make a function to print their average.

    // public static void average(int a, int b, int c){
    //     int avg=(a+b+c)/3;
    //     System.out.println("Average of "+a+" ,"+b+" and "+c+" is "+avg);
    //     return ;
    // }



    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.print("Enter the value of a:");
    //     int a =sc.nextInt();
    //     System.out.print("Enter the value of b:");
    //     int b =sc.nextInt();
    //     System.out.print("Enter the value of c:");
    //     int c =sc.nextInt();

    //     average(a, b, c);
        
    // }
//Write a function to print the sum of all odd numbers from 1 to n.
// public static void oddSum(int n){
//     int sum=0;
//     for(int i=1;i<=n;i++){
//         if(i%2!=0){
//             sum+=i;
//         }
        
//     }
//     System.out.println(sum);
// }


//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the amount of number you want to add:");
//         int n = sc.nextInt();
//         oddSum(n);
//     }


//Write a function which takes in 2 numbers and returns the greater of those two.
//public static void greaterNum(int a, int b){
//     if(a>b){
//         System.out.print(a+" is greater.");
//     }
//     else{
//         System.out.print(b+" is greater.");
//     }
// }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the value of a:");
//     int a = sc.nextInt();
//     System.out.print("Enter the value of b:");
//     int b = sc.nextInt();
//     greaterNum(a,b);
    
// }


//Write a function that takes in the radius as input and returns the circumference of a circle.

// public static void circumCircle(double r){
//     double circ=2*3.14*r;
//     System.out.println("The Circuference of Circle having "+r+" radius is "+circ);
// }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the radius of circle:");
//     double r = sc.nextInt();
//     circumCircle(r);
// }

//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
// public static void canVote(int a){
//     if(a>=18){
//         System.out.println("Eligible for Vote.");
//     }
//     else if(a>0 && a<18){
//         System.out.println("Not Eligible for vote.");
//     }
//     else if (a>0){
//         System.out.println("Invalid Age.");
//     }
// }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter your age:");
//     int a=sc.nextInt();
//     canVote(a);
// }

//Write an infinite loop using do while condition.
// public static void infinitLoop(){
//     for(;;){
//         System.out.print("Samyam Rimal");
//     }
// }
// public static void main(String[] args) {
//     infinitLoop();
// }

//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
// public static void userNum(int n){
//     int num=0;
//     int positive=0;
//     int negative=0;
//     int zero=0;
//     Scanner sc = new Scanner(System.in);
//     for(int i=1;i<=n;i++){
//         System.out.println("Enter the number:");
//         num=sc.nextInt();

//         if(num>0){
//             positive++;
//         }
//         else if(num<0){
//             negative++;
//         }
//         else{
//             zero++;
//         }
//     }
    
//     System.out.println(positive);
//     System.out.println(negative);
//     System.out.println(zero);
// }

// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);

//     System.out.print("How many numbers you want to enter:");
//     int n=sc.nextInt();
//     userNum(n);
// }

//Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.

// public static int power(int x, int n){
//     int p=1;
//     for(int i=1;i<=n;i++){
//         p*=x;
//     }
//     System.out.println(p);
//     return p;
// }

// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.print("Enter the base value:");
//     int x=sc.nextInt();
//     System.out.print("Enter the power value:");
//     int n=sc.nextInt();
//     power(x,n);
// }

public static int power(int n){
    int p=1;
    for(int i=0;i<=n;i++){
        System.out.print(i);
        p+=i;
        System.out.print(p);
    }
    
    return p;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the numer:");
    int n=sc.nextInt();
    power(n);
}


}
