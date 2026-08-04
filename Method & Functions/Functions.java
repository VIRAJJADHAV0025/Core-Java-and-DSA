import java.util.*;
public class Functions {
	// Declare the function
	public static void printMyName(String name) {
		System.out.print(name);
		return;
	}
	// Main Function
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		printMyName(name); // We call the function
	}
}