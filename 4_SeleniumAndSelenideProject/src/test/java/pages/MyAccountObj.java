package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;

public class MyAccountObj {

    SelenideElement btnOrder = $("[title =\"Orders\"]");

    public SelenideElement getBtnOrder() {return btnOrder;}

}
