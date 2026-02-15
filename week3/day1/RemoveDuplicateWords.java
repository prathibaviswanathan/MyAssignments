package week3.day1;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		// Given String
        String text = "We learn Java basics as part of java sessions in java week1";

        // Initialize count variable
        int count = 0;

        // Split the String into words
        String[] words = text.split(" ");

        // Nested loops to compare words
        for (int i = 0; i < words.length; i++) {

            for (int j = i + 1; j < words.length; j++) {

                // Compare words (ignore case to match "Java" and "java")
                if (words[i].equalsIgnoreCase(words[j])) {

                    words[j] = "";   // Replace duplicate with empty string
                    count++;         // Increment duplicate count
                }
            }
        }

        // If duplicates found, print modified array
        if (count > 0) {

            System.out.println("After removing duplicate words:");

            for (int i = 0; i < words.length; i++) {
                if (!words[i].equals("")) {
                    System.out.print(words[i] + " ");
                }
            }
        }


	}

}
