import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class Assignment2 {

    private static final WebDriver driver = new ChromeDriver();

    private static void selectDropdown(String obj, String option) {

        WebElement xpath = driver.findElement(By.xpath(obj));
        Select dropdown = new Select(xpath);
        List<WebElement> options = dropdown.getOptions();
        for (WebElement value : options) {
            System.out.println(value.getText());
        }
        dropdown.selectByVisibleText(option);


    }

    public static void main(String[] args) throws InterruptedException {


        driver.get("https://www.rahulshettyacademy.com/angularpractice/");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@class='form-group']//input[@name='name']")).sendKeys("Test");
        int a = 5;
        driver.findElement(By.xpath("//div[@class='form-group']//input[@name='email']")).sendKeys("Test@test.com");
        driver.findElement(By.xpath("//div[@class='form-group']//input[@placeholder='Password']")).sendKeys("Test");
        driver.findElement(By.xpath("//div[@class='form-check']//input[@type='checkbox']")).click();

        selectDropdown("//select[contains(@id,'Select1')]", "Female");

//        WebElement dropdown = driver.findElement(By.xpath("//select[contains(@id,'Select1')]"));
//        Select gender = new Select(dropdown);
//        gender.selectByVisibleText("Female");

//        driver.findElement(By.xpath("//select[contains(@id,'Select1')]")).click();
//        driver.findElement(By.xpath("//select[contains(@id,'Select1')]//option[text()='Female']")).click();

        driver.findElement(By.xpath("//input[@value='option1']")).click();
        driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("09/09/1923");
        driver.findElement(By.xpath("//input[@value='Submit']")).click();

        if (driver.findElement(By.xpath("//strong[text()='Success!']")).isDisplayed()) {
            System.out.println("Submitted Successfully");
        } else {
            Assert.fail("Submit failed");

        }


    }


}
