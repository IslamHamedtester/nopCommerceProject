package stepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.RegisterPage;
import pages.SuccessPage;

public class Register_StepDef {

    WebDriver driver;
    RegisterPage registerPage;
    SuccessPage successPage;

    @Before
    public void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        registerPage = new RegisterPage(driver);
        successPage = new SuccessPage(driver);
    }

    @Given("user navigate to register page")
    public void user_navigate_to_register_page()
    {
        driver.navigate().to("https://demo.nopcommerce.com/register?returnUrl=%2F");
    }


    @When("user enters first name")
    public void userEntersFirstName() {
        registerPage.firstname_textBox().sendKeys("Islam");
    }

    @And("user enters last name")
    public void userEntersLastName() {
        registerPage.lastname_textBox().sendKeys("Hamed");
    }

    @And("user enters email")
    public void userEntersEmail() {
        registerPage.email_textBox().sendKeys("islam.hamed@gmail.com");
    }

    @And("user enters password")
    public void userEntersPassword() {
        registerPage.password_textBox().sendKeys("123456");
    }

    @And("user enters confirm password")
    public void userEntersConfirmPassword() {
        registerPage.confirmpassword_textBox().sendKeys("123456");
    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {
        registerPage.register_button().click();
    }

    @Then("user should register successfully")
    public void userShouldRegisterSuccessfully() {
        Assert.assertTrue(successPage.success_Message().isDisplayed());
    }

    @After
    public void closeBrowser(){
        driver.close();
    }


}
