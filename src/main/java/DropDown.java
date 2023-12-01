import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class DropDown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        String var = null;
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Bengaluru')]")).click();

        List<WebElement> options = driver.findElements(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']"));

        for (WebElement option : options) {
            if (option.getText().equalsIgnoreCase(var)) {
                option.click();
                break;
            }
        }

        driver.get("http://spicejet.com"); //URL in the browser
        Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
    }
}
