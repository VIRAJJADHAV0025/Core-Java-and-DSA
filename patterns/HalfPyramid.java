import java.util.Scanner;
public class HalfPyramid {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a number to make half pyramid of it: ");
		int n = in.nextInt();
		
		for(int i=1; i <= n; i++) {
			for(int j=1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		} 
	}
}