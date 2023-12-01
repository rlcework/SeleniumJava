import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Locators2 {
    public static void main (String[] args) throws InterruptedException {
        String name = "rahul";
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
        //implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        //Through ID
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        //Through name
        driver.findElement(By.name("inputPassword")).sendKeys(("rahulshettyacademy"));
        //Through class
        driver.findElement(By.className("signInBtn")).click();
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.tagName("p")).getText());
        Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='login-container']/h2")).getText()
                , "Hello " + name + ",");
        Thread.sleep(5000);
        driver.close();
    }

    public void getPassword (WebDriver driver) {

        driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?"));
       // Thread.sleep(5000);
        //driver.FindElec;
    }
}
