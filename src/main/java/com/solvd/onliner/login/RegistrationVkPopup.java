package com.solvd.onliner.login;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class RegistrationVkPopup extends AbstractPage {

    @FindBy(name = "email")
    private ExtendedWebElement emailInput;

    @FindBy(name = "pass")
    private ExtendedWebElement passwordInput;

    @FindBy(id = "install_allow")
    private ExtendedWebElement submitButton;

    public RegistrationVkPopup(WebDriver driver) {
        super(driver);
    }

    public void typeEmail(String email) {
        emailInput.type(email);
    }

    public void typePassword(String password) {
        passwordInput.type(password);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }
}
