//import java.util.*;
// Largest Number in Array
public class LargestNumber {

    public static int findLargestNumber(int numbers[]) {
        int Largest = Integer.MIN_VALUE; // -infinity
        int Smallest = Integer.MAX_VALUE; // +infinity
        for(int i = 0; i < numbers.length; i++) {
            if(Largest < numbers[i]) {
                Largest = numbers[i];
            }
            if(Smallest > numbers[i]) {
                Smallest = numbers[i];
            }
        }
        System.out.println("Smallest number is " + Smallest);
        return Largest;
    }
    public static void main(String [] args) {
        int numbers[] = {1, 2, 6, 4, 5};

        System.out.println("Largest Number is " + findLargestNumber(numbers));
       

    }
}