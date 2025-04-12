import com.microsoft.playwright.*;

public class PostRequestTest {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            APIRequestContext request = playwright.request().newContext(
                new APIRequest.NewContextOptions().setBaseURL("https://api.example.com")
            );

            response = request.get("/createUser", 
                RequestOptions.create()
                    .setHeader("Content-Type", "application/json")
                    .setData("{\"name\":\"John Doe\",\"email\":\"john.doe@example.com\",\"password\":\"SecurePass123\"}")
            );

            assert response == 200;
            assert response.json().get("message").asText().equals("User created successfully");
        }
    }
}
