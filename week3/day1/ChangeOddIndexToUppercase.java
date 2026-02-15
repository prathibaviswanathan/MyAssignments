package week3.day1;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		// Given String
        String str = "changeme";

        // Convert String to character array
        char[] ch = str.toCharArray();

        // Iterate from end to start
        for (int i = ch.length - 1; i >= 0; i--) {

            // Check if index is odd
            if (i % 2 != 0) {

                // Convert character to uppercase if index is odd
                ch[i] = Character.toUpperCase(ch[i]);
            }
        }

        // Print the modified characters
        System.out.println("Output: " + new String(ch));

	}

}
