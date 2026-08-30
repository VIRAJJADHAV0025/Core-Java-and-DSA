import java.util.Scanner;

public class PATTERNS {
    public static void pattern1(int n) {
        /*
        
        * * * * 
        * * * * 
        * * * * 
        * * * * 
        
        */
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pattern2(int n) {
        /*
        
        *
        **
        ***
        ****
        *****
        
        */
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pattern3(int n) {
        /*
        1
        12
        123
        1234
        12345
        */
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pattern4(int n) {
        /*
        1
        22
        333
        4444
        55555
        */
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pattern5(int n) {
        /*

        ******
        *****
        ****
        ***
        **
        *

        */
        for(int i=0; i<=n; i++) {
            for(int j=0; j<n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void pattern6(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pattern7(int n) {
        /*        
            *
           ***
          *****
         *******
        *********

        */
        for(int i=0; i<n; i++) {
            //space
            for(int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            //stars
            for(int j=0; j<(2*i)+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pattern8(int n){
        /*
        *********
         *******
          *****
           ***
            *
        */
        for(int i=0; i<n; i++) {
            //space
            for(int j=0; j<i; j++) {
                System.out.print(" ");
            }
            //stars
            for(int j=0; j<2*n-(2*i+1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pattern9(int n) {
        /* 
        Combined pattern 7 & 8

            *
           ***
          *****
         *******
        *********
        *********
         *******
          *****
           ***
            *
        */ 

        for(int i=0; i<n; i++) {
            //space
            for(int j=0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            //stars
            for(int j=0; j<(2*i)+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0; i<n; i++) {
            //space
            for(int j=0; j<i; j++) {
                System.out.print(" ");
            }
            //stars
            for(int j=0; j<2*n-(2*i+1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pattern10(int n) {
        /*

        *
        **
        ***
        ****
        *****
        ****
        ***
        **
        *

        */
        for(int i=1; i<=2*n-1; i++) {
            int stars = i;
            if(i > n)
                stars = 2*n - i;
            for(int j=1; j<=stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pattern11(int n) {
        /*
        1 
        0 1 
        1 0 1 
        0 1 0 1 
        1 0 1 0 1
        */
        int start = 1;
        for(int i=0; i<n; i++) {
            if(i % 2 == 0)
                start = 1;
            else
                start = 0;

            for(int j=0; j<=i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pattern12(int n) {
        /*
        1        1
        12      21
        123    321
        1234  4321
        1234554321
        */
        int space = 2 * (n-1);
        for(int i=1; i<=n; i++) {
            //numbers
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
            //spaces
            for(int j=1; j<=space; j++) {
                System.out.print(" ");
            }
            //numbers
            for(int j=i; j>=1; j--) {
                System.out.print(j);
            }
            System.out.println();
            space -= 2;
        }
        System.out.println();
    }

    public static void pattern13(int n) {
        /*
        1 
        2 3 
        4 5 6 
        7 8 9 10 
        11 12 13 14 15 
        */
        int num = 1;
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++){
                System.out.print(num + " ");
                num = num + 1;
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pattern14(int n){
        /*
        A 
        A B 
        A B C 
        A B C D 
        A B C D E
        */
        for(int i=0; i<n; i++) {
            for(char ch = 'A'; ch <= 'A' + i; ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pattern15(int n) {
        /*
        A B C D E 
        A B C D 
        A B C 
        A B 
        A 
        */
        for(int i=0; i<n; i++){
            for(char ch = 'A'; ch <= 'A' + (n - i -1); ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pattern16(int n) {
        /*
        A 
        B B 
        C C C 
        D D D D 
        E E E E E 
        */
        for(int i=0; i<n; i++){
            char ch = (char) ('A'+ i);
            for(int j=0; j<=i; j++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a n number: ");
        int n = sc.nextInt();

        pattern1(n);
        pattern2(n);
        pattern3(n);
        pattern4(n);
        pattern5(n);
        pattern6(n);
        pattern7(n);
        pattern8(n);
        pattern9(n);
        pattern10(n);
        pattern11(n);
        pattern12(n);
        pattern13(n);
        pattern14(n);
        pattern15(n);
        pattern16(n);

        sc.close();
    }
}