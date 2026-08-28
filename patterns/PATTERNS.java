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
    }
}