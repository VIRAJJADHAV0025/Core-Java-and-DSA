import java.util.*;
public class factorialFunction {
	// Declare factorial function
	public static void calculateFactorial(int n) {
		// Loop
		if(n < 0) {
			System.out.print("Invalid Number.");
			return;
		}
		int factorial = 1;
		for(int i=n; i>=1; i--) {
			factorial = factorial * i;
		}
		System.out.printf("The factorial of %d is: %d",n,factorial);
		return;
	}
	// Main Function
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		calculateFactorial(n);
	}
}