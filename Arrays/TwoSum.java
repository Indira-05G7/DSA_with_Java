/*
Problem: Two Sum
Platform: General DSA
Difficulty: Easy

Approach:
1. Use two pointers:
   - One pointer at beginning
   - One pointer at end
2. Calculate sum
3. If sum < target → move left pointer
4. If sum > target → move right pointer
5. If sum == target → pair found

Note:
This approach works only for SORTED arrays.

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;
public class TwoSum {
    public static boolean twoSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return true;
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter sorted array:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target: ");
        int target = sc.nextInt();
        boolean result = twoSum(arr, target);
        System.out.println("Pair exists: " + result);
        sc.close();
    }
}