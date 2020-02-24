package com.solvd.onliner;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class UserProfilePage extends AbstractPage {

    @FindBy(className = "profile-header__image")
    private ExtendedWebElement profileImage;

    public UserProfilePage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL("https://profile.onliner.by/");
    }

    public ExtendedWebElement getProfileImage() {
        return profileImage;
    }
}
