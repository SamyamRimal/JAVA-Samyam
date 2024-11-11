public class practiseAdPattern {
    public static void main(String[] args) {
        int n=9;
        System.out.println("----------------------");
        for(int i=1;i<=3;i++){
            for(int j=1;j<=n;j++){
                int sum=i+j;
                if(sum % 4 == 0 || i==2 && j % 4 ==0){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("----------------------");
        for(int i=1;i<=3;i++){
            for(int j=1;j<=n;j++){
                int sum=i+j;
                if(sum % 2 == 0 || i==2 && j % 4 ==0){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("----------------------");
        for(int i=3;i>=1;i--){
            for(int j=1;j<=n;j++){
                int sum=i+j;
                if(sum % 4 == 0 || i==2 && j % 4 ==0){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        int c = 7;
        System.out.println("----------------------");

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * (c - i) - 1); j++) {
                if (j == 0 || j == 2 * (c - i) - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * (c - i) - 1); j++) {
                if (j == 0 || j == 2 * (c - i) - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    



        int b = 7;
        System.out.println("----------------------");

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * (b - i) - 1); j++) {
                if (j == 0 || j == 2 * (b - i) - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = b - 2; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * (b - i) - 1); j++) {
                if (j == 0 || j == 2 * (b - i) - 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    

        int a = 5;
        System.out.println("----------------------");

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= 2 * (a - i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = a; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= 2 * (a - i); j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        int d=5;
        System.out.println("----------------------");

        for(int i=1;i<=d;i++){
            for(int j=1;j<=i;j++){
                System.out.print("& ");
            }
            for(int j=1;j<=2*(d-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("& ");
            }
            System.out.println();
        }

        for(int i=d;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("& ");
            }
            for(int j=1;j<=2*(d-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("& ");
            }
            System.out.println();
        }

    }
}
