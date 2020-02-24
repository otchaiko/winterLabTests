package com.solvd.onliner.kurs;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.solvd.onliner.kurs.componenets.NbrbCurrencyRow;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NbrbPage extends AbstractPage {

    @FindBy(xpath = "//*[@class = 'currencyTable']//tbody//tr")
    private List<NbrbCurrencyRow> nbrbCurrencyRows;

    public NbrbPage(WebDriver driver) {
        super(driver);
        setPageAbsoluteURL("http://www.nbrb.by/statistics/rates/ratesdaily.asp");
    }

    public List<NbrbCurrencyRow> getNbrbCurrencyRows() {
        return nbrbCurrencyRows;
    }
}
