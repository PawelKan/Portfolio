package tests.automation_practice;

import com.codeborne.selenide.Condition;
import data.TestUrls;
import org.testng.annotations.Test;
import pages.HeaderPageObj;

import static com.codeborne.selenide.Selenide.open;

public class HomePageTests extends TestBase {

    @Test
    public void checkHeaderOnPage(){
        HeaderPageObj headerPage = new HeaderPageObj();

        open(TestUrls.BASE_URL);

        headerPage.getHeader().shouldBe(Condition.visible);
        headerPage.getBtnSignIn().shouldBe(Condition.visible).shouldHave(Condition.text("Sign in"));
        headerPage.getBtnContactUs().shouldBe(Condition.visible).shouldHave(Condition.text("Contact us"));
    }
}
