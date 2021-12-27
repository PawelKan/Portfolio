package pages;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;

public class HeaderPageObj {

    @Getter
    SelenideElement header = $("#header");

    @Getter
    SelenideElement btnContactUs = header.$("#contact-link");

    @Getter
    SelenideElement btnSignIn = header.$(".login");

    @Getter
    SelenideElement btnSignOut = header.$(".logout");

    @Getter
    SelenideElement btnUserDisplayedName = header.$(".account");
}
