package Numbers;

/*Problem Statement: Given an integer N, return true if it is a
 palindrome else return false. A palindrome is a number that reads 
 the same backward as forward. For example, 121, 1331, and 
 4554 are palindromes because they remain the same when their digits are reversed.
*/

public class PalindromeNumber {

    static boolean palindrome(int number) {
        // Initialize a variable to store the reverse of the number
        int revNum = 0;
        // Create a duplicate variable to store the original number
        int dup = number;
        // Iterate through each digit of the number until it becomes 0
        while (number > 0) {
            // Extract the last digit of the number
            int ld = number % 10;

            revNum = (revNum * 10) + ld;
            // Remove the last digit from the original number
            number = number / 10;
        }
        // Check if the original number is equal to its reverse
        if (dup == revNum) {
            // If equal, return true indicating it's a palindrome
            return true;
        } else {
            // If not equal, return false indicating it's not a palindrome
            return false;
        }

    }

    public static void main(String[] args) {

        int number = 122;
        palindrome(number);

        if (palindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }

    }
}
