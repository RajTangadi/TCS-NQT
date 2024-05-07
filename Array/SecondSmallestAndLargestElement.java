package Array;

//https://takeuforward.org/data-structure/find-second-smallest-and-second-largest-element-in-an-array/
public class SecondSmallestAndLargestElement {

    public static int secondSmallestNumber(int arr[], int n) {

        // edge case
        if (n < 2) {
            return -1;
        }
        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < small) {
                secondSmall = small;
                small = arr[i];
            }
            if (arr[i] < secondSmall && arr[i] != small) {
                secondSmall = arr[i];
            }
        }
        return secondSmall;
    }

    public static int secondLargestNumber(int arr[], int n) {

        // edge case
        if (n < 2) {
            return -1;
        }
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > large) {
                secondLarge = large;
                large = arr[i];
            }
            if (arr[i] > secondLarge && arr[i] != large) {
                secondLarge = arr[i];
            }
        }
        return secondLarge;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 4, 7, 10, 7, 5 };
        int second_smallest = secondSmallestNumber(arr, arr.length);
        int second_largest = secondLargestNumber(arr, arr.length);

        System.out.println("Second smallest is: " + second_smallest);
        System.out.println("Second largest is: " + second_largest);

    }
}
