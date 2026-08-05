import java.util.Scanner;
public class sumOfAllOddNumberFunction {
	public static void calculateSumOfAllOddNumber(int n) {
		int sum = 0;
		for(int i=1; i<=n; i++) {
			if(i % 2 != 0) {
				sum += i;
			}
		}
		System.out.print("The sum of all odd number between 1 to " + n + " is " + sum);
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number to calculate sum of all odd number between them: ");
		int n = sc.nextInt();
		calculateSumOfAllOddNumber(n);
	}
}