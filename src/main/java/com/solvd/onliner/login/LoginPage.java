package com.solvd.onliner.login;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {

    @FindBy(xpath = "//a[@href = 'https://profile.onliner.by/registration']")
    private ExtendedWebElement signUpLink;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void clickSignUpLink() {
        signUpLink.click();
    }
}
