/* 
Question 4: Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

Example 1:

Input: height = [0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.

Example 2:

Input: height = [4, 2, 0, 3, 2, 5]
Output: 9

Constraints:

n == height.length
1 <= n <= 2 * 10^4
0 <= height[i] <= 10^5 
*/

import java.util.Scanner; 
public class TrapRainWater {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the size of height  : ");
        int n = input.nextInt();

        int height[] = new int[n];

        System.out.print("Enter the height : ");
        for(int i = 0; i < n; i++) {
            height[i] = input.nextInt();
        }

        System.out.println("The trapped rain water is " + trappedRainWater(height));
    }

    public static int trappedRainWater(int height[]) {
        int n = height.length;

        int res = 0; // Stores trapped water
        int l = 0, r = n - 1; // l points to left and r points to right
        int rMax = height[r]; // Tallest wall from right side 
        int lMax = height[l]; // Tallest wall from left side

        while(l < r) {
            // left wall is shorter → left side is the limiting factor
            if(lMax < rMax) {
                l++;
                
                // update tallest wall seen from left
                lMax = Math.max(lMax, height[l]);

                // water at this position = tallest left wall - current height
                // if current height >= lMax, this adds 0 (no water here)
                res += lMax - height[l];
            } else {
                // right wall is shorter → right side is the limiting factor
                r--;

                // update tallest wall seen from right
                rMax = Math.max(rMax, height[r]);

                // water at this position = tallest right wall - current height
                // if current height >= rMax, this adds 0 (no water here)
                res += rMax - height[r];
            }
        } 
        return res;
    }
}