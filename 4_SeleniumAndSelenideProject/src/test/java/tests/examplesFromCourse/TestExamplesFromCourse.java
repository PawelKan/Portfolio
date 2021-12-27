package tests.examplesFromCourse;

import configs.DriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestExamplesFromCourse {
    @Test
    public void openBrowserWithGooglePage(){
        DriverManager.getWebDriver().navigate().to("http://www.google.pl");
    }

    @Test
    public void openGoogleSiteWithChrome(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.google.pl");
    }

    @Test
    public void openGoogleSiteWithFirefox(){
        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.navigate().to("http://www.google.pl");
    }

//    @Test
//    public void selenideTest(){
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        WebDriverRunner.setWebDriver(driver);
//
//        open("http://www.automationpractice.com");
//        $("#contact-link").click();
//        $("#editorial_block_center > h1").shouldHave(Condition.text("Automation Practice Website")).;
//    }

}
