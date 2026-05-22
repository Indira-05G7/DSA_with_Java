/*
Problem: Move all zeros to end of array
Approach: Two Pointer

Algorithm:
1. Maintain pointer j for position of next non-zero
2. Traverse array
3. Whenever non-zero found, swap with arr[j]
4. Increment j

Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.*;
public class moveZeros {
    public static void zeros(int arr[]) {
        int j = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
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
        zeros(arr);
        System.out.println("Array after moving zeros:");
        for(int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}