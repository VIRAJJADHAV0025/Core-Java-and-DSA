import java.util.*;
public class ageForVoteFunction {
	public static void calculateAgeOfVoting(int age) {
		if(age >= 18) {
			System.out.print("You are eligible for voting.");
		}else {
			System.out.print("You are not eligible for voting, comeback after " + (18 - age) + " year.");
		}
		return;
	}
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		
		calculateAgeOfVoting(age);
	}
}