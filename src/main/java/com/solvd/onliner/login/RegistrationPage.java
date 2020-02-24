package com.solvd.onliner.login;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends AbstractPage {

    @FindBy(className = "auth-form__button_vk")
    private ExtendedWebElement vkLink;

    public RegistrationPage(WebDriver driver) {
        super(driver);
        setPageURL("/registration");
    }

    public void clickVkLink() {
        vkLink.click();
    }
}
