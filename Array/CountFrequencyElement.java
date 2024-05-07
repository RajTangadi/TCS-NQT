package Array;

//https://takeuforward.org/data-structure/count-frequency-of-each-element-in-the-array/
import java.util.HashMap;
import java.util.Map;

public class CountFrequencyElement {
    // method1
    static void countFrequency(int arr[], int n) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        // Traverse through map and print frequencies
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    // method2
    static void countFrequency1(int arr[], int n) {

        boolean visited[] = new boolean[n];

        for (int i = 0; i < n; i++) {

            // Skip this element if already processed
            if (visited[i] == true)
                continue;

            // count frequency
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
        }
    }

    public static void main(String[] args) {

        int arr[] = { 10, 5, 10, 15, 10, 5 };
        // countFrequency1(arr, arr.length);
        countFrequency(arr, arr.length);

    }
}
