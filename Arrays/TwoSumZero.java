/*
Problem: Check if array contains two elements with sum = 0
Approach: Sorting + Two Pointer

Algorithm:
1. Sort the array
2. Place one pointer at beginning and another at end
3. If sum == 0 → pair found
4. If sum > 0 → move right pointer left
5. If sum < 0 → move left pointer right

Time Complexity: O(n log n)
Space Complexity: O(1)
*/

import java.util.*;
public class TwoSumZero {
    public static boolean isTwoSum(int[] arr) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == 0) {
                return true;
            }
            else if (sum > 0) {
                right--;
            }
            else {
                left++;
            }
        }
        return false;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Pair exists: " + isTwoSum(arr));
        sc.close();
    }
}
