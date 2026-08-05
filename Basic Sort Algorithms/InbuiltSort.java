import java.util.Arrays;
import java.util.Collections; // For reverse order
public class InbuiltSort {
    public static void printArray(Integer arr[]) { // Change int to Integer
        for(int i=0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        // O(n log n)
        /*
        int arr[] = {5, 4, 1, 3, 2};

        // Sort Array in Ascending Order
        Arrays.sort(arr); 
        printArray(arr);
        */

        // Sort Array in Descending Order
        Integer arr[] = {5, 4, 1, 3, 2};

        Arrays.sort(arr, Collections.reverseOrder());
        printArray(arr);
    }
}
