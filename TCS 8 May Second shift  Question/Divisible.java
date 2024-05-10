/* 
Problem Statement:-
Take input of integer array
If the element in array is divisible by 5 then print “Five”
If the element in array is divisible by 3 then print “ Three”
If the element in array is divisible by both 3 and 5 then print “ ThreeFive”
If the element in array is not divisible by both 3 and 5 then print value of array
For Example1:-
Sample Input: 1 3 5 9 15 30
Output: 1 Three Five Three ThreeFive ThreeFive
For example2:-
Sample Input:- 55 30 60 19 17 33
Output:- Five ThreeFive ThreeFive 19 17 Three
*/

import java.util.Scanner;

public class Divisible {
    static void printInput(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                System.out.print("ThreeFive" + " ");
            } else if (arr[i] % 3 == 0) {
                System.out.print("Three" + " ");
            } else if (arr[i] % 5 == 0) {
                System.out.print("Five" + " ");
            } else {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total input size: ");
        int inputSize = sc.nextInt();
        int arr[] = new int[inputSize];
        for (int i = 0; i < inputSize; i++) {
            arr[i] = sc.nextInt();
        }
        printInput(arr, arr.length);
    }
}
