package tests;

import com.codeborne.selenide.Condition;
import data.TestData;
import data.TestUrls;
import org.testng.annotations.Test;
import pages.HeaderPageObj;
import pages.LoginPageObj;
import pages.MyAccountObj;

import static com.codeborne.selenide.Selenide.open;

public class AutomationPractice_HomePageTests extends TestBase {

    @Test
    public void checkHeaderOnPage(){
        HeaderPageObj headerPage = new HeaderPageObj();

        open(TestUrls.BASE_URL);

        headerPage.getHeader().shouldBe(Condition.visible);
        headerPage.getBtnSignIn().shouldBe(Condition.visible).shouldHave(Condition.text("Sign in"));
        headerPage.getBtnContactUs().shouldBe(Condition.visible).shouldHave(Condition.text("Contact us"));
    }
}
