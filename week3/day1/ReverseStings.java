package week3.day1;

public class ReverseStings {

	public static void main(String[] args) {
		 // Given input
        String companyName = "TestLeaf";

        // Convert the String to a character array
        char[] charArray = companyName.toCharArray();

        // Iterate from end to start and print characters
        System.out.print("Reversed String: ");
        for (int i = charArray.length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }

	}

}
	
