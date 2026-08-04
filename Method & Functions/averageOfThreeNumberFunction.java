import java.util.Scanner;
public class averageOfThreeNumberFunction {
	public static void averageOfThreeNumber(double a, double b, double c) {
		double average = (a + b + c) / 3 ; // formula
        System.out.print("The average of three number is " + average);
        return;  		
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter three number to calculate there average: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		averageOfThreeNumber(a,b,c);
		
	}
}