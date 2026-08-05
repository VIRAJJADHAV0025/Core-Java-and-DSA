import java.util.Scanner;
public class powerOfNumberFunction {
	public static void calculatePowerOfNumber(int num1, int num2) {
		int power = 1;
		for(int i=1; i<=num2; i++) {
			power *=num1;
		}
		
		System.out.print("The power of " + num1 + "^" + num2 + " is " + power);
		return;
	}
	
	public static void main(String [] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int a = userInput.nextInt();
		
		System.out.print("\nEnter second number,It will be power of first number: ");
		int b = userInput.nextInt();
		
		calculatePowerOfNumber(a,b);
	}
}