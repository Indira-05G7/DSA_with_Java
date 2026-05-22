/*
Problem: Union of Two Sorted Arrays
Approach: Two Pointer

Algorithm:
1. Traverse both sorted arrays using two pointers
2. Add smaller element
3. Skip duplicates
4. If equal, add once and move both pointers
5. Add remaining elements

Time Complexity: O(n + m)
Space Complexity: O(n + m)
*/

import java.util.*;
public class findUnion {
    public static ArrayList<Integer> union(int arr1[], int arr2[]) {
        int n = arr1.length;
        int m = arr2.length;
        int i = 0, j = 0;
        ArrayList<Integer> result = new ArrayList<>();
        while(i < n && j < m){
            if(arr1[i] < arr2[j]){
                if(result.size()==0 ||
                   result.get(result.size()-1)!=arr1[i]){
                    result.add(arr1[i]);
                }
                i++;
            }
            else if(arr1[i] > arr2[j]){
                if(result.size()==0 ||
                   result.get(result.size()-1)!=arr2[j]){
                    result.add(arr2[j]);
                }
                j++;
            }
            else{
                if(result.size()==0 ||
                   result.get(result.size()-1)!=arr1[i]){
                    result.add(arr1[i]);
                }
                i++;
                j++;
            }
        }
        while(i<n){
            if(result.size()==0 ||
               result.get(result.size()-1)!=arr1[i]){
                result.add(arr1[i]);
            }
            i++;
        }
        while(j<m){
            if(result.size()==0 ||
               result.get(result.size()-1)!=arr2[j]){
                result.add(arr2[j]);
            }
            j++;
        }
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();
        int arr1[] = new int[n];
        System.out.println("Enter sorted elements:");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.print("Enter size of second array: ");
        int m=sc.nextInt();
        int arr2[]=new int[m];
        System.out.println("Enter sorted elements:");
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        ArrayList<Integer> result=union(arr1,arr2);
        System.out.println(result);
        sc.close();
    }
}