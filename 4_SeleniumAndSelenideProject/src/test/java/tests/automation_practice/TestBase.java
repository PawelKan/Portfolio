package tests.automation_practice;


import configs.DriverManagerWithSelenide;
import org.junit.After;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase  {

    @BeforeMethod
    public void setupWebDriver(){
        DriverManagerWithSelenide.getDriver();
        DriverManagerWithSelenide.maximizeDriver();
    }

    @AfterMethod
    public void tearDown(){
        DriverManagerWithSelenide.tearDriver();
    }

}
