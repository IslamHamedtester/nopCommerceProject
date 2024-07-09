package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SuccessPage {

    WebDriver driver;

    public SuccessPage (WebDriver driver){
        this.driver = driver ;
    }

    public WebElement success_Message()
    {
        return driver.findElement(By.className("result"));
    }
}
