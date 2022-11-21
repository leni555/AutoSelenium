package TestCases;

import Core.BaseDriver;
import Mapping.Dropdown;
import Mapping.NewWebCheckboxesPage;
import Mapping.NewWebHomePage;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropdownTestCase extends BaseDriver {

    @BeforeTest
    public void DropdownTest1(){
        startSession();
        PageFactory.initElements(driver, Dropdown.class);
        PageFactory.initElements(driver, NewWebHomePage.class);
    }

    @Test
    public void DropdownTestCase()throws InterruptedException{
        Thread.sleep(1000);
        NewWebHomePage.DropdownPageLink.click();
        Thread.sleep(1000);
        Select Options= new Select(Dropdown.DropdownList);
        Options.selectByVisibleText("Option 1");
        Thread.sleep(5000);
        Options.selectByIndex(2);
        Thread.sleep(5000);


    }



}
