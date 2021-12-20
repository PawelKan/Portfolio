package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import data.TestData;
import data.TestUrls;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPageObj;
import pages.MyAccountObj;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AutomationPracticeTests {
    @Test
    public void loginIntoAccount(){
        LoginPageObj loginPage = new LoginPageObj();
        MyAccountObj myAccount = new MyAccountObj();

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverRunner.setWebDriver(driver);
        open(TestUrls.LOGIN_PAGE_URL);

        //login page check
        loginPage.getTxtUserMail().sendKeys(TestData.userName);
        loginPage.getTxtUserPass().sendKeys(TestData.userPassword);
        loginPage.getBtnSubmit().click();

        //My account check
        myAccount.getBtnOrder().shouldHave(Condition.text("Order history and details"));
    }
}
