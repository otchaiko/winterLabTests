import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.solvd.onliner.login.AllowAccessVkPage;
import com.solvd.onliner.HomePage;
import com.solvd.onliner.login.LoginPage;
import com.solvd.onliner.login.RegistrationPage;
import com.solvd.onliner.login.RegistrationVkPopup;
import com.solvd.onliner.UserProfilePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthTest extends AbstractTest {

    private static final String VK_PHONE = "adasdsdsas";
    private static final String VK_PASSWORD = "sddcsadasd";

    @Test
    public void verifySignUpTest() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        homePage.getLoginComponent().clickLoginButton();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickSignUpLink();
        RegistrationPage registrationPage = new RegistrationPage(getDriver());
        registrationPage.clickVkLink();

        String mainWindowId = getDriver().getWindowHandle();

        registrationPage.switchWindow();

        RegistrationVkPopup registrationVkPopup = new RegistrationVkPopup(getDriver());
        registrationVkPopup.typeEmail(VK_PHONE);
        registrationVkPopup.typePassword(VK_PASSWORD);
        registrationVkPopup.clickSubmitButton();

        AllowAccessVkPage allowAccessVkPage = new AllowAccessVkPage(getDriver());
        if (allowAccessVkPage.getAccessButton().isElementPresent(5)) {
            allowAccessVkPage.switchWindow();
            allowAccessVkPage.clickAccessButton();
        }

        getDriver().switchTo().window(mainWindowId);

        UserProfilePage userProfilePage = new UserProfilePage(getDriver());
        Assert.assertTrue(userProfilePage.isPageOpened(), "Profile page is not opened after success registration");
        Assert.assertTrue(userProfilePage.getProfileImage().isElementPresent(), "Profile image is not present after success registration");
    }
}
