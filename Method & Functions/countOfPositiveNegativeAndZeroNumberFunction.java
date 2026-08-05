import java.util.Scanner;
public class countOfPositiveNegativeAndZeroNumberFunction {
	public static void main(String [] args) {
		Scanner userInput = new Scanner(System.in);
		int pos = 0;		
		int neg = 0;
		int zero = 0;
		
		for(int i=1; i>0; i++) {
			System.out.print("Enter a number: ");
		    int num = userInput.nextInt();
			
			if(num > 0) {
				pos++;
			}else if(num < 0) {
				neg++;
			}else {
				zero++;
			}	
		
		System.out.print("\nEnter N to exit or Y to continue... ");
        char choice = userInput.next().charAt(0);
        if(choice == 'n' || choice == 'N') 
			break;	
		}
		
		System.out.print("\nYou Enter positive number " + pos + " times.");
		System.out.print("\nYou Enter negative number " + neg + " times.");
		System.out.print("\nYou Enter zero number " + zero + " times.");
		
		userInput.close();
	}
}