package com.solvd.onliner;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.onliner.components.Header;
import com.solvd.onliner.login.component.LoginComponent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    @FindBy(id = "userbar")
    private LoginComponent loginComponent;

    @FindBy(className = "b-top-menu")
    private Header header;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public LoginComponent getLoginComponent() {
        return loginComponent;
    }

    public Header getHeader() {
        return header;
    }
}
