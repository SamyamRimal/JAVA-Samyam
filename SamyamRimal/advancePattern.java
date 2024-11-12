// Advance pattern

public class advancePattern {
    public static void main(String[] args) {
        //Butterfly Pattern
    int n=4;
    for(int i=1; i<=n; i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        int spaces =2*(n-i);
        for(int j=1;j<=spaces;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println("");
    }
    System.out.println("--------------------------------------");
    for(int i=n; i>=1; i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        int spaces =2*(n-i);
        for(int j=1;j<=spaces;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println("");
    }    


    // Solid Rhombus
    
    for(int i=1;i<=5;i++){
        int spaces=n-i;
        for(int j=1;j<=spaces;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=5;j++){
            System.out.print("*");
        }
        System.out.println();
    }

    // Number Pyramid
    
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    //BOB Pattern
   
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=i;j>=1;j--){
            System.out.print(j);
        }
        for(int j=2;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }

    //Diamond Pattern
    for(int i=1;i<=n;i++){
        //space
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }
        // for(int j=2;j<=i-1;j++){
        //     System.out.print("*");
        // }
        System.out.println();
    }

    for(int i=n;i>=1;i--){
        //space
        for(int j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=2*i-1;j++){
            System.out.print("*");
        }
        // for(int j=2;j<=i-1;j++){
        //     System.out.print("*");
        // }
        System.out.println();
    }

    for(int i=1;i<=5;i++){
        for(int j=1;j<=5;j++){
            System.out.println("*");
        }
    }
    }

}
