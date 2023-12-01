import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class Locators {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/locatorspractice/");

        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        //Through ID
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");

        //Through name
        driver.findElement(By.name("inputPassword")).sendKeys(("test"));

        //Through class
        driver.findElement(By.className("signInBtn")).click();

        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        //CSS selector
        driver.findElement(By.cssSelector("p.error")).getText();

        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

        // Link text
        driver.findElement(By.linkText("Forgot your password?")).click();

        //add wait
        Thread.sleep(1000);

        //Through Xpath
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("test");


        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[contains(text(),'Reset Login')]")).click();

        System.out.println(driver.findElement(By.xpath("//form/p[contains(text(),\"Please use temporary password 'rahulshettyacademy' to Login.\")]")).getText());


    }
}
