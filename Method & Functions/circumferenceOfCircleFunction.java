import java.util.*;
public class circumferenceOfCircleFunction {
	public static void calculateCircumferenceOfCircle(double radius) {
		double circumferenceOfCircle;
		double pi = 3.142;
		circumferenceOfCircle = pi * radius * radius;
		System.out.print("The cricumference of circle is: " + circumferenceOfCircle);
		return;
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter radius to calculate circumference of circle: ");
		double radius = sc.nextDouble();
		
		calculateCircumferenceOfCircle(radius);
		
	}
}