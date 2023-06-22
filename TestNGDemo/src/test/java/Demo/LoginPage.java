package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class LoginPage {
    public WebDriver driver;
    LoginPage (WebDriver localDriver)
    {
        this.driver=localDriver;
    }
    public void Login(String un, String pass) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(un);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pass);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
}
