/*Question 1: Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:

Input: nums = [1, 2, 3, 1]
Output: true

Example 2:

Input: nums = [1, 2, 3, 4]
Output: false

Example 3:

Input: nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
Output: true

Constraints:

1 <= nums.length <= 10^5
-10^9 <= nums[i] <= 10^9
*/

import java.util.Scanner;
import java.util.HashSet;
public class ContainsDuplicate {
    // O(n^2) space O(1)
    public static boolean bruteForce(int arr[]) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    // O(n) space O(n) Using Hash Sets
    public static boolean hashSet(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++) {
            if(set.contains(arr[i])) {
                return true;
            }else {
                set.add(arr[i]);
            }
        }
        return false;
    }
        
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        

        System.out.print("Enter size of array : ");
        int n = input.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter elements : ");
        for(int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println(bruteForce(arr));

        System.out.println(hashSet(arr));
    }
}