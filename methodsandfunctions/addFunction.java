import java.util.*;
public class addFunction {
	// Declare the add function
	public static int calculateSum(int a, int b) {
		int sum = a + b;
		return sum;
	}
	// Main Function
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int a = sc.nextInt();
		System.out.print("Enter thr second number: ");
		int b = sc.nextInt();
		
		int sum = calculateSum(a,b);
		
		System.out.print("The sum of two number is: " + sum);
		
	}
}