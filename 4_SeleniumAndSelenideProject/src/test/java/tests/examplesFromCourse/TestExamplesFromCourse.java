package tests.examplesFromCourse;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;

import configs.DriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.TestBase;

import static com.codeborne.selenide.Selenide.*;


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

    @Test
    public void selenideTest(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverRunner.setWebDriver(driver);

        open("http://www.automationpractice.com");
        $("#contact-link").click();
        $("#editorial_block_center > h1").shouldHave(Condition.text("Automation Practice Website")).;
    }
}
