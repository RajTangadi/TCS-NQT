package Array;

import java.util.Arrays;

/*Problem Statement: Given an unsorted array, find the median of the given array.
Example 1:
Input: [2,4,1,3,5]
Output: 3

Example 2:
Input: [2,5,1,7]
Output: 3.5*/
public class Median {
    static void median(int arr[], int n) {

        Arrays.sort(arr);

        if (n % 2 == 0) {
            int ind1 = (n / 2) - 1;
            int ind2 = (n / 2);
            System.out.print((double) (arr[ind1] + arr[ind2]) / 2);
        } else {
            System.out.print(arr[(n / 2)]);
        }
    }

    public static void main(String[] args) {

        int arr[] = { 4, 7, 1, 2, 5, 6 };
        System.out.print("The median of the array is: ");
        median(arr, arr.length);
    }

}
