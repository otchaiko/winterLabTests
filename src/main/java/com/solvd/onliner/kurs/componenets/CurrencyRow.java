package com.solvd.onliner.kurs.componenets;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class CurrencyRow extends AbstractUIObject {

    @FindBy(xpath = ".//td[1]/p[1]/b")
    private ExtendedWebElement currencyName;

    @FindBy(xpath = ".//td[2]/p[1]/b")
    private ExtendedWebElement purchaseRate;

    @FindBy(xpath = ".//td[3]/p[1]/b")
    private ExtendedWebElement saleRate;

    @FindBy(xpath = ".//td[4]/p[1]/b")
    private ExtendedWebElement nbrbRate;

    public CurrencyRow(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public String getCurrencyName() {
        return currencyName.getText().split(" ")[1];
    }

    public String getPurchaseRate() {
        return purchaseRate.getText();
    }

    public String getSaleRate() {
        return saleRate.getText();
    }

    public String getNbrbRate() {
        return nbrbRate.getText();
    }
}
