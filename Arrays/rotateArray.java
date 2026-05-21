/*
Problem: Rotate Array by K positions
Approach: Using Extra Array

Algorithm:
1. Take k rotations
2. Reduce k using k % n
3. Store rotated elements in a temporary array
4. Return rotated array

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;
public class rotateArray {
    public static int[] rotate(int arr[], int k) {
        int n = arr.length;
        k = k % n;
        int temp[] = new int[n];
        for(int i = 0; i < n; i++) {
            temp[i] = arr[(i + k) % n];
        }
        return temp;
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
        System.out.print("Enter number of rotations: ");
        int k = sc.nextInt();
        int result[] = rotate(arr, k);
        System.out.println("Rotated array:");
        for(int num : result) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}