package pages;

import com.codeborne.selenide.SelenideElement;
import tests.TestBase;

import static com.codeborne.selenide.Selenide.$;

public class LoginPageObj extends TestBase {

    SelenideElement txtUserMail = $("#email");
    SelenideElement txtUserPass = $("#passwd");
    SelenideElement btnSubmit =  $("#SubmitLogin");

    public SelenideElement getTxtUserMail(){ return txtUserMail; }
    public SelenideElement getTxtUserPass(){ return txtUserPass; }
    public SelenideElement getBtnSubmit(){ return btnSubmit; }

}
