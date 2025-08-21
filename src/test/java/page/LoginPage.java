package page;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void EnterUserName(String username) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By emailLocator = By.xpath("//input[@id='email/phone']");
        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(emailLocator));
        emailField.clear();
        emailField.sendKeys(username);
    }

    public void EnterPassword(String password) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By passwordLocator = By.xpath("//input[@placeholder='Password']");
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(passwordLocator));
        passwordField.clear();
        passwordField.sendKeys(password);
    }

    public void ClickSign_Now() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        By signInButtonLocator = By.xpath("//button[normalize-space()='Sign in Now']");
        WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(signInButtonLocator));

        try {
            signInButton.click(); // Try normal click first
        } catch (ElementNotInteractableException e) {
            // Fallback to JavaScript click
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", signInButton);
        }

       //  Wait for login to process – change this based on post-login page behavior
        wait.until(ExpectedConditions.or(
                ExpectedConditions.urlContains("dashboard"),
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//footer[@class='page-footer']"))
        ));
    }

    public void validatestudentpriflelogin() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement title = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//footer[@class='page-footer']")));
            //h3[text()='Hi, How can I help you today?']
            if (title.isDisplayed()) {
                System.out.println("✅ Login Successful");
                Assert.assertTrue(true);
            } else {
                System.out.println("❌ Login Failed");
                Assert.fail("Login failed - title not displayed");
            }
        } catch (TimeoutException e) {
            System.out.println("❌ Login failed: Title not found in expected time.");
            e.printStackTrace();
            Assert.fail("Login failed - TimeoutException");
        } catch (Exception e) {
            System.out.println("❌ Unexpected error during login validation.");
            e.printStackTrace();
            Assert.fail("Login failed - Unexpected Exception");
        }
    }
}
