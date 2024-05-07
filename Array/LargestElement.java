package Array;

public class LargestElement {

    static int largestElement(int nums[], int n) {

        int largestNumber = Integer.MIN_VALUE;

        /*
         * for(int i = 0; i < n; i++) {
         * 
         * if(largestNumber < nums[i]) {
         * 
         * largestNumber =nums[i];
         * 
         * } }
         */

        for (int i = 0; i < nums.length; i++) {

            largestNumber = Math.max(largestNumber, nums[i]);

        }

        return largestNumber;

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int nums[] = { 8, 10, 5, 7, 123143, 1, -2, 100, 12320 };

        System.out.println("largest Element in array is: " + largestElement(nums, nums.length));

    }

}
