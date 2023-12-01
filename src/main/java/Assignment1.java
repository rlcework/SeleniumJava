import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class Assignment1 {

    public static void main (String [] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //1.
        driver.findElement(By.xpath("//legend[text()='Checkbox Example']")).isDisplayed();
        driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected(),"Succesfully selected");
        driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
        Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected(), "Succesfully unchecked");

        //2.
        System.out.println(driver.findElements(By.xpath("//input[contains(@value, 'option')]")).size());

//        List <WebElement> options = driver.findElements(By.xpath("//input[contains(@value, 'option')]"));
//        for(WebElement option:options) {
//            System.out.println("k");
//
//        }

    }
}
