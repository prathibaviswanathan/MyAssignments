package week3.day2;

public class TestData {
	// Method 1
    public void enterCredentials() {
        System.out.println("Entering credentials...");
    }

    // Method 2
    public void navigateToHomePage() {
        System.out.println("Navigating to Home Page...");
    }


// Main class to demonstrate inheritance
//public class Main {
    public static void main(String[] args) {

        // Creating object of superclass
        TestData testData = new TestData();
        testData.enterCredentials();
        testData.navigateToHomePage();

        System.out.println("---------------------");

                // Calling inherited methods
      LoginTestDataa login = new LoginTestDataa();
      login.enterUsername();
      login.enterPassword();
      
    }     

}
