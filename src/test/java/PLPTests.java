import Pages.PLPPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PLPTests extends BaseTest{

    @Test
    public void signUpSuccessTest(){

        String checkoutButtonLabel = new PLPPage(driver)
                .openPLPPage()
                .clickCartButton()
                .getCheckoutButtonLabel();
        Assert.assertEquals(checkoutButtonLabel, "CHECKOUT");

    }
}
