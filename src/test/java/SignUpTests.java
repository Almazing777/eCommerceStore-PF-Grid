
import Pages.HomePage;
import Pages.SignUpPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Pages.SignUpPage.getRandomEmail;

public class SignUpTests extends BaseTest{

    @Test
    public void signUpSuccess() {

        SignUpPage signUpPage = new SignUpPage(driver);

        signUpPage.getPage();
        signUpPage.setEmailField(getRandomEmail());
        signUpPage.setPassword("incorrectPassword");
        signUpPage.setConfirmPassword("incorrectPassword");
        signUpPage.setZipCode("90020");
        signUpPage.clickCheckboxTermsAndConditions();
        signUpPage.clickCheckboxHIPAA();
        signUpPage.clickToSignUp();
        signUpPage.assertAndFindPhoneNumber();
    }

    @Test
    public void signUpWrongEmail() {
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.getPage();
        signUpPage.setEmailField("gmail.com");
        signUpPage.setPassword("incorrectPassword");
        signUpPage.setConfirmPassword("setConfirmPassword");
        signUpPage.setZipCode("90020");
        signUpPage.clickCheckboxTermsAndConditions();
        signUpPage.clickCheckboxHIPAA();
        signUpPage.clickToSignUp();

        signUpPage.assertErrorElement();

    }

    @Test
    public void signUpEmptyCredentials(){
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.getPage();
        signUpPage.setWrongEmailField("");
        signUpPage.setPassword("");
        signUpPage.setConfirmPassword("");
        signUpPage.setZipCode("");

        signUpPage.clickCheckboxTermsAndConditions();
        signUpPage.clickCheckboxHIPAA();
        signUpPage.assertSignUpButtonVisible();



    }
}
