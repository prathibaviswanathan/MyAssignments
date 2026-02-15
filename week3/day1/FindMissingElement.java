package week3.day1;

public class FindMissingElement {

	public static void main(String[] args) {
		// Given array
        int[] arr = {1, 4, 3, 2, 8, 6, 7};

        // Find maximum number in array
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Calculate expected sum from 1 to max
        int expectedSum = max * (max + 1) / 2;

        // Calculate actual sum of array elements
        int actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }

        // Missing number
        int missingNumber = expectedSum - actualSum;

        // Print missing number
        System.out.println("Missing Number is: " + missingNumber);

	}

}
