package Array;

public class SmallestElement {

    static int smallestElement(int nums[], int n) {

        int smallestNumber = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            if (nums[i] < smallestNumber) {

                smallestNumber = nums[i];

            }
        }

        /*
         * for(int i = 0; i < nums.length; i ++) {
         * 
         * smallestNumber = Math.min(smallestNumber, nums[i]);
         * 
         * }
         */

        return smallestNumber;
    }

    public static void main(String[] args) {

        int nums[] = { 8, 10, 5, 7, 9, 1, -2 };

        System.out.println("smallest Element in array is: " + smallestElement(nums, nums.length));

    }

}
