import java.util.Scanner;
public class greatestNumberBetweenTwoNumberFunction {
	public static void calculateGreatestNumber(int num1, int num2) {
		if(num1 > num2) {
			System.out.print("The greatest number of them is: " + num1);
		}else {
			System.out.print("The greatest number of them is: " + num2);
		}
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter two number to find greatest of them: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		calculateGreatestNumber(num1,num2);
	}
}