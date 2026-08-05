import java.util.*;
// Kadane's Algorithm
public class MaxSubArrayKadanes {
    public static void kadanes(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for(int i = 0; i < numbers.length; i++) {
            currentSum = currentSum + numbers[i];
            maxSum = Math.max(currentSum, maxSum); // if all value are negative it will return closets value to Zero
            if(currentSum < 0) {
                currentSum = 0;
            }
        }

        System.out.println("Maximum sum is " + maxSum);
    }

    public static void main(String [] args) {
        int numbers[] = {-2, -3, 1, 2, -3};

        kadanes(numbers);

    }
}