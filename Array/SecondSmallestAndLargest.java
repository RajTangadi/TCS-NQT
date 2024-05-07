package Array;

public class SecondSmallestAndLargest {

    // second smallest and secondLargest element t in array
    // https://takeuforward.org/data-structure/find-second-smallest-and-second-largest-element-in-an-array/

    static void secondLargestAndSmallest(int arr[], int n) {

        /*
         * if(n < 2) { return -1; }
         */

        // Edge case
        if (n == 0 || n == 1) {
            System.out.print(-1);
            System.out.print(" ");
            System.out.print(-1);
            System.out.print("\n");
        }

        int large = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int i = 0;
        for (i = 0; i < n; i++) {
            small = Math.min(small, arr[i]);
            large = Math.max(large, arr[i]);
        }

        for (i = 0; i < n; i++) {
            if (arr[i] < secondSmallest && arr[i] != small) {
                secondSmallest = arr[i];
            }

            if (arr[i] > secondLargest && arr[i] != large) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Second smallest is " + secondSmallest);
        System.out.println("Second largest is " + secondLargest);

    }

    public static void main(String[] args) {

        int arr[] = { 2, 3, 4, 5, 6, 0, 0, 7, 99, 10, 99 };

        secondLargestAndSmallest(arr, arr.length);
    }
}
