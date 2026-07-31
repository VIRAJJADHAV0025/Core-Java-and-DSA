import java.util.Scanner;
public class isPrimeOrNotFunction {
	// To check the given number is prime or not
	public static void checkIfPrimeOrNot(int n) {
		// Defalut case
		if(n == 0 || n == 1) {
			System.out.print(n + " is not a prime number.");
			return;
		}
		// Loop to check is number prime or not
		for(int i =2; i<=n/2; i++) {
			if(n % i == 0) {
				System.out.print(n + " is not a prime number.");
				return;
			}	
		}
		// If no divisor found, It is prime
		System.out.print(n + " is a prime number.");
		return;
	}
	// Taking a user input
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		checkIfPrimeOrNot(n);
		
		sc.close();
	}
}