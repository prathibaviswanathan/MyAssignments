package week1.day2;

public class NumberPalindrome {

	public static void main(String[] args) {
		   int number = 121;   // Change the value to test other inputs
	        int originalNumber = number;
	        int reversed = 0;

	        // Reverse the number
	        while (number != 0) {
	            int digit = number % 10;
	            reversed = reversed * 10 + digit;
	            number = number / 10;
	        }

	        // Check for palindrome
	        if (originalNumber == reversed) {
	            System.out.println("It is a Palindrome");
	        } else {
	            System.out.println("It is not a Palindrome");
	        }
	    }

	}


