package Array;

/*
 * explanation:-
 * 
 * first we reverse the whole array
 * 
 * original array:- 1 2 3 4 5 6 7 k = 3
 * reverse array:- 6 7 5 4 3 2 1
 * 0 k n-1
 * 
 * output should be 5 6 7 1 2 3 4
 * 
 * here we reversing array from 0 to k-1 so we get first part,after reversing
 * array looked like this
 * array :- 5 6 7 4 3 2 1
 * 
 * now, again reversing from k to n-1 so we get final output
 * array :- 5 6 7 1 2 3 4
 * 
 * 
 */
public class RotateArrayKPosition {

    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        reverseArray(nums, 0, nums.length - 1);
        reverseArray(nums, 0, k - 1);
        reverseArray(nums, k, nums.length - 1);
    }

    public static void reverseArray(int nums[], int start, int end) {

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int k = 3;

        System.out.print("Original Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n");

        System.out.print("rotating Array: ");
        rotate(arr, 3);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
