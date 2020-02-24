package com.solvd.onliner.login;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class FinishRegistrationPage extends AbstractPage {

    @FindBy(xpath = "//input[@placeholder = 'Ваш e-mail']")
    private ExtendedWebElement emailInput;

    @FindBy(xpath = "//button[@type = 'submit']")
    private ExtendedWebElement registerProfileButton;

    public FinishRegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void typeEmail(String email) {
        emailInput.type(email);
    }

    public void clickRegisterProfileButton() {
        registerProfileButton.click();
    }
}
