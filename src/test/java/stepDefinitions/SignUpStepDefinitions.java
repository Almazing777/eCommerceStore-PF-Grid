package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class SignUpStepDefinitions {

    WebDriver driver;



    //user open browser
//    @Given("user open browser")
    @Before
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait()
    }

    //user open register page
    @When("user open {word} page")
    public void openSignUpPage(String url) {
        driver.get("https://deens-master.now.sh/" + url);
    }


    @When("user input email {string}")
    public void enterEmail(String email) {
        driver.findElement(By.cssSelector("#email")).sendKeys(email);
    }

    @When("user input password {string}")
    public void enterPassword(String password) {
        driver.findElement(By.cssSelector("#password")).sendKeys(password);
    }

    @When("user input username {string}")
    public void enterUsername(String username) {
        driver.findElement(By.cssSelector("#username")).sendKeys(username);
    }

    @When("user clicks sign up button")
    public void clickRegister() {
        driver.findElement(By.cssSelector(".button.green-btn")).click();
    }

    //Error message should appear
    @Then("Error message should appear")
    public void errorMessageAppears() {
        Boolean errorMessageDisplays = driver.findElement(By.cssSelector(".ui.message")).isDisplayed();
        Assert.assertTrue(errorMessageDisplays);
    }


    //user closes the browser
//    @Then("user closes the browser")
    @After
    public void closeBrowser() {
        driver.quit();
    }


}