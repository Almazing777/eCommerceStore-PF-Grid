package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.sql.Timestamp;

public class SignUpPage extends BasePage {


    public SignUpPage(WebDriver myDriver){
        super(myDriver);
    }

    public  void getPage(){
        driver.findElement(By.xpath("//div[@class='styled__Wrapper-sc-5elvgs-0 gTjIWz']/div/div[3]")).click();
    }

    public static String getRandomEmail() {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.getTime() + "@gmail.com";
    }

    public void setEmailField(String email){
        WebElement emailField = driver.findElement(By.cssSelector("[placeholder='Email']"));
        emailField.sendKeys(email);
    }

    public  void setWrongEmailField(String email){
        WebElement emailField = driver.findElement(By.cssSelector("[placeholder='Email']"));
        emailField.sendKeys(email);
    }

    public  void setPassword(String password){
        WebElement passwordField = driver.findElement(By.cssSelector("[placeholder='Password']"));
        passwordField.sendKeys(password);
    }

    public  void setConfirmPassword(String password){
        WebElement passwordConfirm = driver.findElement(By.cssSelector("[placeholder='Confirm Password']"));
        passwordConfirm.sendKeys(password);
    }

    public  void setZipCode(String zipCode){
        WebElement zip = driver.findElement(By.cssSelector("[placeholder='Zipcode']"));
        zip.sendKeys(zipCode);
    }

    public  void clickCheckboxTermsAndConditions(){
        WebElement checkBoxOne = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='styled__CheckboxWrapper-sc-1x07d2p-2 cjrWjQ'] [class*='ws-checkbox']")));
        checkBoxOne.click();
    }

    public  void clickCheckboxHIPAA(){
        WebElement checkBoxTwo = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='styled__CheckboxWrapper-sc-1x07d2p-2 cIPcIz'] [class*='ws-checkbox']")));
        checkBoxTwo.click();
    }

    public  void clickToSignUp(){
        WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]"));
        button.click();
    }

    public void assertErrorElement(){
        WebElement errorAlert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[content='Oops!']")));
        Assert.assertTrue(errorAlert.isDisplayed());
    }

    public void assertAndFindPhoneNumber(){
        WebElement phoneNumber = wait.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector("[content='Confirm Phone Number']"))));
        Assert.assertTrue(phoneNumber.isDisplayed());
    }

    public void assertSignUpButtonVisible(){
        WebElement signUpButton = driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]"));
        Assert.assertFalse(signUpButton.isEnabled());
    }

}
