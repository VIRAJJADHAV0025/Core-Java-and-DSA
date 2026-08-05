import java.util.*;
import java.math.*;
// Print Sub Array
public class SubArray {
    public static void printSubArray(int numbers[]) {
        int sum = 0;

        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        int totalSubArray = 0;

        for(int i = 0; i < numbers.length; i++) {
            int start = i;

            for(int j = i; j < numbers.length; j++) {
                int end = j;
                int currentSum = 0; // Reset the sum

                for(int k = start; k <= end; k++) {
                    sum += numbers[k];
                    currentSum += numbers[k]; // Add
                    System.out.print(numbers[k] + " ");
                }

                maxSum = Math.max(maxSum, currentSum);
                minSum = Math.min(minSum, currentSum);
                totalSubArray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Maximum sum in Sub Array = " + maxSum);
        System.out.println("Minimum sum in Sub Array = " + minSum);
        System.out.println("Sum of Sub Array = " + sum);
        System.out.println("Total Sub Array = " + totalSubArray);
    }
    public static void main(String [] args) {
        int numbers[] = {2, 4, 6, 8, 10};

        printSubArray(numbers);

    }
}

/*           DRY RUN 
Input: numbers[] = {2, 4, 6, 8, 10}

i	j	Subarray	currentSum	maxSum	minSum
i = 0 (start = 0)
0	0	2	            2	      2 ↑	  2 ↓
0	1	2 4	            6	      6 ↑	  2
0	2	2 4 6	        12	      12 ↑	  2
0	3	2 4 6 8	        20	      20 ↑	  2
0	4	2 4 6 8 10	    30	      30 ↑	  2
i = 1 (start = 1)
1	1	4	             4	      30	  2
1	2	4 6	            10	      30	  2
1	3	4 6 8	        18	      30	  2
1	4	4 6 8 10	    28	      30	  2
i = 2 (start = 2)
2	2	6	             6	      30	  2
2	3	6 8	            14	      30	  2
2	4	6 8 10	        24	      30	  2
i = 3 (start = 3)
3	3	8	             8	      30	  2
3	4	8 10	        18	      30	  2
i = 4 (start = 4)
4	4	10	            10	      30	  2

max subarray sum = 30
→ [2, 4, 6, 8, 10]
min subarray sum = 2
→ [2]
total subarrays = 15
n*(n+1)/2 = 5*6/2
*/