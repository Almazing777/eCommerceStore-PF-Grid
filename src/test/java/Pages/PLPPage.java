package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PLPPage {

    WebDriver myDriver;

    public PLPPage(WebDriver myDriver) {
        this.myDriver = myDriver;
        PageFactory.initElements(myDriver, this);
    }

    @FindBy(css = "[class*='ButtonWrapper'] a")
    private WebElement checkoutElement;

    //public WebElement getCheckoutElement(){
    //return findElement ("[class*='ButtonWrapper'] a");
    // }

    @FindBy(css = "[class*='CartButton']")
    private WebElement cartButton;

    public String getCheckoutButtonLabel(){
        return checkoutElement.getText();
    }

    public PLPPage clickCartButton() {
        cartButton.click();
        return this;
    }

    public PLPPage openPLPPage() {
        myDriver.get("https://test.woahstork.com/cbdmarketplace");
        return this;
    }
}
