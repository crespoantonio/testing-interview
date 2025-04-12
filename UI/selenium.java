import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class selenium {

    public static void main(String[] args) {        
        WebDriver driver = new ChromeDriver(); 
        driver.get("www.example.com/login");  
        
        // Finding elements on the page
        WebElement username = driver.findElement(By.id("usename"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement loginBtn = driver.findElement(By.id("loginButton"));
        
        usernameField.sendKeys("admin");  
        passwordField.sendKeys("password123");

        loginButton.click();

        
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement dashboard = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dashbord"))); 
       
        driver.quit(); 
    }
}