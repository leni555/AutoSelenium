package Mapping;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewWebHomePage {

    WebDriver Driver;

    //Checkboxes page link
    @FindBy(xpath = "//*[@id='content']/ul/li[6]/a")
    public static WebElement checkboxesPageLink;

    //Dropdown page link
    @FindBy(xpath ="/html/body/div[2]/div/ul/li[11]/a")
    public static WebElement DropdownPageLink;
}
