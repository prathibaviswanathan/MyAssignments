package week3.day2;

public class APIClient {
	  // Method 1: Accepts only endpoint
    public void sendRequest(String endpoint) {
        System.out.println("Sending request to endpoint: " + endpoint);
        System.out.println("Request sent successfully (default settings).");
    }

    // Method 2: Accepts endpoint, requestBody, and requestStatus
    public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
        System.out.println("Sending request to endpoint: " + endpoint);
        System.out.println("Request Body: " + requestBody);

        if (requestStatus) {
            System.out.println("Request was successful.");
        } else {
            System.out.println("Request failed.");
        }
    }

    // Main Method
    public static void main(String[] args) {

        // Create object of APIClient
        APIClient client = new APIClient();

        // Call first overloaded method
        client.sendRequest("https://api.example.com/getUsers");

        System.out.println("-----------------------------");

        // Call second overloaded method
        client.sendRequest(
                "https://api.example.com/createUser",
                "{ \"name\": \"John\", \"role\": \"Admin\" }",
                true
        );
    }
}


