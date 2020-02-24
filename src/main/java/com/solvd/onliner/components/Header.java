package com.solvd.onliner.components;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class Header extends AbstractUIObject {

    @FindBy(xpath = ".//*[@href = 'https://kurs.onliner.by/']")
    private ExtendedWebElement exchangeRateButton;

    public Header(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public ExtendedWebElement getExchangeRateButton() {
        return exchangeRateButton;
    }

    public void clickExchangeRateButton() {
        exchangeRateButton.click();
    }
}
