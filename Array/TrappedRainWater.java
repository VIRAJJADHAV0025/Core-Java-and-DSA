import java.util.*;
// Calculate Trapped Water
/*
 * Trapping Rainwater
 *
 * Problem Statement:
 * Given an array of non-negative integers representing an elevation map,
 * where the width of each bar is 1, compute the total amount of rainwater
 * that can be trapped after raining.
 *
 * Example:
 * height = [4, 2, 0, 6, 3, 2, 5]
 *
 * Elevation Map:
 *
 *          __
 *          ||
 *  __      ||
 *  ||      ||          __
 *  ||  __  ||  __  __  ||
 *  ||  ||  ||  ||  ||  ||
 * _||__||__||__||__||__||_
 *
 *  4   2   0   6   3   2   5
 *
 * Output:
 * 11
 */
public class TrappedRainWater {
    public static int trappedRainWater(int height[]) {
        int n = height.length;
        // Calculate left max boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // Calculate right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for(int i = n -2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        int trappedWater = 0;
        // loop
        for(int i = 0; i < n; i++) {
            // WaterLevel = min(left max bound, right max bound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // trappedWater = (waterLevel - height[i]) * width , Since width is here 1.
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;

    }

    public static void main(String [] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};

        System.out.println("Trapped rain water = " + trappedRainWater(height));
        
    }
}