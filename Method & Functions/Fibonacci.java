import java.util.Scanner;
public class Fibonacci {
    static void fibIterative(int n) {
        int first = 0, second = 1;

        System.out.print("Iterative   : ");
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first  = second;
            second = next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();

        System.out.println("\n--- Fibonacci Series ---");
        fibIterative(n);

        sc.close();
    }
}