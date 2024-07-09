package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {

    WebDriver driver ;

    public RegisterPage (WebDriver driver){
        this.driver = driver ;
    }

    public WebElement firstname_textBox()
    {
        return driver.findElement(By.id("FirstName"));
    }

    public WebElement lastname_textBox()
    {
        return driver.findElement(By.id("LastName"));
    }

    public WebElement email_textBox()
    {
        return driver.findElement(By.id("Email"));
    }

    public WebElement password_textBox()
    {
        return driver.findElement(By.id("Password"));
    }

    public WebElement confirmpassword_textBox()
    {
        return driver.findElement(By.id("ConfirmPassword"));
    }

    public WebElement register_button()
    {
        return driver.findElement(By.id("register-button"));
    }


}
