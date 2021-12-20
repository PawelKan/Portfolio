package pages;


import org.junit.After;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    private WebDriver driver;

    @BeforeMethod
    public void setupWebDriver(){
        this.driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown(){
        this.driver.close();
        this.driver.quit();
    }

}
