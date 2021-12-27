package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import tests.automation_practice.TestBase;

import static com.codeborne.selenide.Selenide.$;

public class MyAccountObj extends TestBase {


    @Getter
    SelenideElement btnOrder = $("[title =\"Orders\"]");

    @Getter
    SelenideElement btnMyCreditSlips = $("[title =\"Credit slips\"]");

    @Getter
    SelenideElement btnMyAdresses = $("[title =\"My addresses\"]");

    @Getter
    SelenideElement btnMyPersonalInformation = $("[title =\"Information\"]");

    @Getter
    SelenideElement myWishlist = $("[title =\"My wishlists\"]");

    

    //public SelenideElement getBtnOrder() {return btnOrder;}

}
