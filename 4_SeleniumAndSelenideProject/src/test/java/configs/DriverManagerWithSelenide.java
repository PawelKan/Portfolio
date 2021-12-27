package configs;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideConfig;
import com.codeborne.selenide.SelenideDriver;
import com.codeborne.selenide.WebDriverRunner;
import data.TestUrls;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Selenide.open;

public class DriverManagerWithSelenide {

    public static WebDriver driver;

    public static void getDriver(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        Configuration.timeout = 15000;
        driver = new ChromeDriver();
        WebDriverRunner.setWebDriver(driver);
    }

    public static void tearDriver(){
        WebDriverRunner.getWebDriver().close();
        WebDriverRunner.getWebDriver().quit();
    }

    public static void maximizeDriver(){
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }
}
