package TestCases;

import Core.BaseDriver;
import Mapping.NewWebCheckboxesPage;
import Mapping.NewWebHomePage;
import Mapping.OldWebsiteHomePage;
import Mapping.OldWebsiteSingInPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static Mapping.NewWebCheckboxesPage.checkboxesNumber1;

public class CheckboxesTestCases extends BaseDriver {

    @BeforeTest
    public void CheckboxesTestCases() {
        startSession();
        PageFactory.initElements(driver, NewWebCheckboxesPage.class);
        PageFactory.initElements(driver, NewWebHomePage.class);
    }

    @Test
    public void checkTheFirstCheckbox() throws InterruptedException  {
        Thread.sleep(1000);
        NewWebHomePage.checkboxesPageLink.click();
        Thread.sleep(1000);
        checkboxesNumber1.click();
        Thread.sleep(5000);
        NewWebCheckboxesPage.checkboxesNumber2.click();
        Thread.sleep(5000);

        WebElement checkBoxesElement1= checkboxesNumber1;
        boolean isSelected= checkboxesNumber1.isSelected();
        if(isSelected==false);
        checkboxesNumber1.click();
    }

       @AfterTest
       public void CheckBoxTestCasesFinish(){
        stopSession();
       }
}

