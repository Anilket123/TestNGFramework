package Demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
public class orangeHrm {
    WebDriver driver;
    @BeforeClass
    public void Browsersetup(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.setCapability(ChromeOptions.CAPABILITY, options);
        driver = WebDriverManager.chromedriver().capabilities(options).create();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @BeforeMethod
    public void getBeforeurl(){
        System.out.println("current url is :" + driver.getCurrentUrl());
    }
    @AfterMethod
    public void getAfterurl(){
        System.out.println("current url is :" + driver.getCurrentUrl());
        System.out.println("Title is:" + driver.getTitle());
    }
@Test
    public void HrmLogin() throws InterruptedException {
       // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     //   new WebDriverWait(driver,Duration.ofSeconds(5)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@type='submit']")));
     //   driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        LoginPage h1=new LoginPage(driver);
        h1.Login("Admin","admin123");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}