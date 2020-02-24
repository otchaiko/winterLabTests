import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.solvd.onliner.HomePage;
import com.solvd.onliner.kurs.KursPage;
import com.solvd.onliner.kurs.NbrbPage;
import com.solvd.onliner.kurs.componenets.CurrencyRow;
import com.solvd.onliner.kurs.componenets.NbrbCurrencyRow;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class ExchangeRateTest extends AbstractTest {

    @Test
    public void verifyExchangeRateTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();

        Assert.assertTrue(homePage.getHeader().getExchangeRateButton().isElementPresent(), "Exchange rate button does not exist");

        homePage.getHeader().clickExchangeRateButton();

        KursPage kursPage = new KursPage(getDriver());
        Assert.assertTrue(kursPage.isPageOpened(), "Exchange rate page is not opened after navigation menu button clicking");

        Map<String, String> exchangeRates = new HashMap<String, String>();

        for (CurrencyRow currencyRow : kursPage.getCurrencyRows()) {
            exchangeRates.put(currencyRow.getCurrencyName(), currencyRow.getNbrbRate());
        }

        NbrbPage nbrbPage = new NbrbPage(getDriver());
        nbrbPage.open();

        Map<String, String> nbrbExchangeRates = new HashMap<String, String>();

        for (NbrbCurrencyRow nbrbCurrencyRow : nbrbPage.getNbrbCurrencyRows()) {
            nbrbExchangeRates.put(nbrbCurrencyRow.getCurrencyName(), nbrbCurrencyRow.getAmount());
        }

        for (String currencyName : exchangeRates.keySet()) {
            String amount = exchangeRates.get(currencyName);
            String nbrbAmount = nbrbExchangeRates.get(currencyName);
            Assert.assertEquals(amount, nbrbAmount, "Amount for currency " + currencyName + " is not equals with NBRB exchnage rate");
        }
    }
}
