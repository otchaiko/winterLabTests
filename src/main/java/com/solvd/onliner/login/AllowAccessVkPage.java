package com.solvd.onliner.login;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AllowAccessVkPage extends AbstractPage {

    @FindBy(xpath = "//button[text() = 'Разрешить']")
    private ExtendedWebElement accessButton;

    public AllowAccessVkPage(WebDriver driver) {
        super(driver);
    }

    public ExtendedWebElement getAccessButton() {
        return accessButton;
    }

    public void clickAccessButton() {
        accessButton.click();
    }
}
