package TestCases;
import Core.BaseDriver;
import Mapping.OldWebsiteHomePage;
import Mapping.OldWebsiteSingInPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class CasesOldWebsiteSignInPageTest extends BaseDriver {

@BeforeTest
    public void SignInPageTestCases() {
    startSession();
    PageFactory.initElements(driver, OldWebsiteHomePage.class);
    PageFactory.initElements(driver, OldWebsiteSingInPage.class);
}

@Test
    public void CannotLogInWithBadCredentials(){
    OldWebsiteHomePage.signInButton.click();
    OldWebsiteSingInPage.emailTextFiled.sendKeys("dudi@email.com");
    OldWebsiteSingInPage.passwordTextField.sendKeys("AutomationIsTheBest");
    OldWebsiteSingInPage.applySignInButton.click();
    String ErrorMSGtext = OldWebsiteSingInPage.authenticationFailedError.getText();
    Assert.assertTrue(ErrorMSGtext.equals("Authentication Failed"));
}



}
