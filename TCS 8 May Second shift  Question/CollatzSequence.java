
/* 
problem statement:-
Given an integer and first task is to

Task 1-print the collatz sequence upto ending with 1 the sequence should be in the following way
-> if the number is even:
F(n)=n//2
-> if the number is odd:
F(n)=3"n+1

This sequence should end until the last element of sequence is 1
Task -2
For the given integer from 1,n it should calculate the sequence of each k value i.e, 1<=k<=n
Calculate the maximum length of sequence list of each k 
value and return the maximum length of the sequence 
list of the k value and the k value itself

Task-3
For the given integer from 1,n it should calculate the sequence of each k value i.e, 1<=k<=n Calculate the maximum 
value of the each sequence within the sequence list of 
each k value and return the maximum value of the 
sequence list of the k value and those k value itself

Example
Input: 5
output: 5 16 8 4 2 1
Input: 3
Output: 3 10 5 16 8 4 2 1
Input: abc
Output: Error!
Input:- 12.2
Output: Error!
Input: -13
Output: Error!
*/
import java.util.Scanner;

public class CollatzSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n < 1) {
                System.out.println("Error");
            } else {
                System.out.print(n + " ");
                while (n != 1) {
                    if (n % 2 == 0) {
                        n = n / 2;
                    } else {
                        n = 3 * n + 1;
                    }
                    System.out.print(n + " ");
                }
            }
        } else {
            System.out.println("Error!");
        }
        scanner.close();
    }
}
