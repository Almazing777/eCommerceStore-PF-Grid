import Pages.HomePage;
import Pages.PLPPage;
import Pages.SignUpPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Timestamp;

public class SignUpTests extends  BaseTest {



    @Test(priority = 1)
    public void SignUpSuccessTest () {

        SignUpPage signUpPage = new SignUpPage(getDriver());

        signUpPage.openSignUpPage();

        signUpPage.setEmailField(signUpPage.getRandomEmail());

        signUpPage.setPasswordField("incorrectPassword");
//        signUpPage.setUserName(signUpPage.getRandomUsername());
        signUpPage.clickToLoginButton();
//        signUpPage.setConfirmPasswordField("incorrectPassword");
//        signUpPage.setZipCode("90066");
//
//        signUpPage.clickCheckboxTermsAndConditions();
//        signUpPage.clickCheckboxHIPAA();
//
//        HomePage homePage = signUpPage.clickToLoginButton();
//        WebElement phoneNumber = signUpPage.getPhoneNumberElement(); //driver.findElement(By.cssSelector("[label=\"Your Phone Number\"]"));
//
//        Assert.assertTrue(phoneNumber.isDisplayed());

    }

    @Test(priority = 1)
    public void SignUpSuccessTest2 () {

        SignUpPage signUpPage = new SignUpPage(getDriver());

        signUpPage.openSignUpPage();

        signUpPage.setEmailField(signUpPage.getRandomEmail());

        signUpPage.setPasswordField("incorrectPassword");
//        signUpPage.setUserName(signUpPage.getRandomUsername());
        signUpPage.clickToLoginButton();
//        signUpPage.setConfirmPasswordField("incorrectPassword");
//        signUpPage.setZipCode("90066");
//
//        signUpPage.clickCheckboxTermsAndConditions();
//        signUpPage.clickCheckboxHIPAA();
//
//        HomePage homePage = signUpPage.clickToLoginButton();
//        WebElement phoneNumber = signUpPage.getPhoneNumberElement(); //driver.findElement(By.cssSelector("[label=\"Your Phone Number\"]"));
//
//        Assert.assertTrue(phoneNumber.isDisplayed());

    }




}