import Pages.PLPPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PLPTests extends  BaseTest {

    @Test
    public void SignUpSuccessTest () {

        String checkoutButtonLabel = new PLPPage(getDriver())
                .openPLPPage()
                .clickCartButton()
                .getCheckoutButtonLabel();

        Assert.assertEquals(checkoutButtonLabel, "CHECKOUT");

        // Given user is on PLP page
        // When user clicks Cart button
        // Then some text should be "CHECKOUT"
    }

}