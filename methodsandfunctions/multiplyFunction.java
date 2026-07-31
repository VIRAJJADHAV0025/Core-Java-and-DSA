import java.util.*;
public class multiplyFunction {
	// Declare multiply function
	public static int calculateMultiplication(int a, int b) {
		int multiply = a * b;
		return multiply;
	}
	// Main Function
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		int a = sc.nextInt();
		
		System.out.print("Enter the second number: ");
		int b = sc.nextInt();
		
		int multiply = calculateMultiplication(a,b);
		System.out.print("Multiplication of two number is: " + multiply);
	}
}