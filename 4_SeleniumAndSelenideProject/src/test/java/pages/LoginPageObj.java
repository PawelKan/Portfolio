package pages;

import com.codeborne.selenide.SelenideElement;
import data.TestData;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPageObj {

    SelenideElement txtUserMail = $("#email");
    SelenideElement txtUserPass = $("#passwd");
    SelenideElement btnSubmit =  $("#SubmitLogin");

    public SelenideElement getTxtUserMail(){ return txtUserMail; }
    public SelenideElement getTxtUserPass(){ return txtUserPass; }
    public SelenideElement getBtnSubmit(){ return btnSubmit; }

}
