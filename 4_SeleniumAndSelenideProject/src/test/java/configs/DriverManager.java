package configs;

import com.codeborne.selenide.SelenideDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {

    private static WebDriver driver;
    private static String BROWSER_NAME = "FIREFOX";
    private DriverManager(){};

    public static WebDriver getWebDriver(){
        if (driver == null){
            switch (BROWSER_NAME){
                case "CHROME":{
                    System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
                    return driver = new ChromeDriver();
                }
                case "FIREFOX":{
                    System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver.exe");
                    return driver = new FirefoxDriver();
                }
                default: {
                    System.out.println("DRIVER WAS NOT FOUND");
                    return driver = null;
                }
            }
        }
        else{
            return driver;
        }
    }

}
