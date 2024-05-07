package Array;

public class ReverseArray {

    // method1
    static void reverseArray(int arr[], int n) {

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    // method2
    static void reverseArray1(int arr[], int n) {

        int i = 0;
        int j = n - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
        reverseArray(arr, arr.length);
        reverseArray1(arr, arr.length);
    }

}
