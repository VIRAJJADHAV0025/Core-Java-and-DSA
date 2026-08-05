import java.util.Scanner;
public class commonDivisorFuntion {
	public static int calculateCommonDivisor(int a, int b) {
		while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
		return a;
	}
	
	public static void main(String [] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
		int a = userInput.nextInt();
		
		System.out.print("Ënter the second number: ");
		int b = userInput.nextInt();
		
		calculateCommonDivisor(a,b);

		System.out.println("The GCD of " + a + " and " + b + " is " + calculateCommonDivisor(a, b));
	}
}