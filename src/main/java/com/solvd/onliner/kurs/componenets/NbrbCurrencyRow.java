package com.solvd.onliner.kurs.componenets;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class NbrbCurrencyRow extends AbstractUIObject {

    @FindBy(className = "curAmount")
    private ExtendedWebElement currencyName;

    @FindBy(className = "curCours")
    private ExtendedWebElement amount;

    public NbrbCurrencyRow(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public String getCurrencyName() {
        return currencyName.getText().split(" ")[1];
    }

    public String getAmount() {
        return amount.getText();
    }
}
