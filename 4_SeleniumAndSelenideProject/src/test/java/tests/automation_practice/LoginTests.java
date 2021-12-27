package tests;

import com.codeborne.selenide.Condition;

import data.TestData;
import data.TestUrls;

import okhttp3.internal.http2.Header;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HeaderPageObj;
import pages.LoginPageObj;
import pages.MyAccountObj;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AutomationPractice_LoginTests extends TestBase {
    @Test
    public void loginIntoAccountWithLogout(){
        LoginPageObj loginPage = new LoginPageObj();
        MyAccountObj myAccount = new MyAccountObj();
        HeaderPageObj myHeader = new HeaderPageObj();

        open(TestUrls.LOGIN_PAGE_URL);
        loginPage.getTxtUserMail().sendKeys(TestData.userName);
        loginPage.getTxtUserPass().sendKeys(TestData.userPassword);
        loginPage.getBtnSubmit().click();

        //My account check
        myAccount.getBtnOrder().shouldHave(Condition.text("Order history and details"));
        myAccount.getBtnMyCreditSlips().shouldHave(Condition.text("My credit slips"));
        myAccount.getBtnMyAdresses().shouldHave(Condition.text("My addresses"));
        myAccount.getBtnMyPersonalInformation().shouldHave(Condition.text("My personal information"));
        myAccount.getMyWishlist().shouldHave(Condition.text("My wishlists"));

        // Logout from application and check username is not displayed
        myHeader.getBtnUserDisplayedName().shouldBe(Condition.visible).shouldHave(Condition.text(TestData.userDisplayedName));
        myHeader.getBtnSignOut().click();
        myHeader.getBtnUserDisplayedName().shouldNotBe(Condition.visible);
    }
}
