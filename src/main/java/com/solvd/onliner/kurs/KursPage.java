package com.solvd.onliner.kurs;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.onliner.kurs.componenets.CurrencyRow;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class KursPage extends AbstractPage {

    @FindBy(xpath = "//*[@class = 'b-currency-table__best' and .//*[contains(@class, 'rate')]]")
    private List<CurrencyRow> currencyRows;

    public KursPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL("https://kurs.onliner.by/");
    }

    public List<CurrencyRow> getCurrencyRows() {
        return currencyRows;
    }
}
