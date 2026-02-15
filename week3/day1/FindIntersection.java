package week3.day1;

public class FindIntersection {

	public static void main(String[] args) {
		   // Declare first array
        int a[] = {3, 2, 11, 4, 6, 7};

        // Declare second array
        int b[] = {1, 2, 8, 4, 9, 7};

        System.out.println("Matching elements are:");

        // Outer loop for first array
        for (int i = 0; i < a.length; i++) {

            // Nested loop for second array
            for (int j = 0; j < b.length; j++) {

                // Compare elements
                if (a[i] == b[j]) {
                    System.out.println(a[i]);
                    break;  // Avoid duplicate printing
                }
            }
        }

	}

}
