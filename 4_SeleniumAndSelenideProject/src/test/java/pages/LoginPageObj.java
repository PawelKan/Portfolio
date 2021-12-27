package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import tests.automation_practice.TestBase;

import static com.codeborne.selenide.Selenide.$;

public class LoginPageObj extends TestBase {

    @Getter
    SelenideElement txtUserMail = $("#email");

    @Getter
    SelenideElement txtUserPass = $("#passwd");

    @Getter
    SelenideElement btnSubmit =  $("#SubmitLogin");
}
