package week3.day2;

public class LengthofLastword {
	public static int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;
        // Step 1: Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        // Step 2: Count characters of last word
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        return length;
    }
    // Main method to test examples
    public static void main(String[] args) {

        String s1 = "Hello World";
        String s2 = "   fly me   to   the moon  ";
        String s3 = "luffy is still joyboy";

        System.out.println("Output 1: " + lengthOfLastWord(s1)); // 5
        System.out.println("Output 2: " + lengthOfLastWord(s2)); // 4
        System.out.println("Output 3: " + lengthOfLastWord(s3)); // 6
  }
}
