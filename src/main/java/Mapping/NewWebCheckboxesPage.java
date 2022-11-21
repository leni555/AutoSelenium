package Mapping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewWebCheckboxesPage {

    WebDriver driver;

    @FindBy (xpath ="/html/body/div[2]/div/div/form/input[1]" )
    public static WebElement checkboxesNumber1;

    @FindBy (xpath = "/html/body/div[2]/div/div/form/input[2]")
    public static WebElement checkboxesNumber2;
}

