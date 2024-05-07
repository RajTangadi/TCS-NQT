package Array;

public class SumSmallestAndLargestNumber {

    static int largestElement(int nums[], int n) {

        int largestNumber = Integer.MIN_VALUE;
        int smallestNumber = Integer.MAX_VALUE;

        // int arr[] = new int[2];

        for (int i = 0; i < n; i++) {

            if (largestNumber < nums[i]) {

                largestNumber = nums[i];

            }

            if (nums[i] < smallestNumber) {
                smallestNumber = nums[i];
            }

        }

        /*
         * arr[0] = largestNumber;
         * arr[1] = smallestNumber;
         * return arr[0] + arr[1];
         */

        int sum = largestNumber + smallestNumber;
        return sum;

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int nums[] = { 8, 10, 5, 7, 9, 30, 2, 100, 10000 };

        System.out.println("smallest Element in array is: " + largestElement(nums, nums.length));

    }

}
