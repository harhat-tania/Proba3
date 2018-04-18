package testAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
   
    private WebDriver driver;

    @FindBy(linkText = "MacBook")
    private WebElement productTab;

    @FindBy(xpath = "(//a[@href='#tab-review'])")
    private WebElement reviewsTab;
   
    public HomePage(WebDriver driver) {
   	PageFactory.initElements(driver, this);
   	this.driver = driver;
       }

    public void clickProductTab() {
	productTab.click();
    }

    public void clickReviewsTab() {
	reviewsTab.click();

    }
}
