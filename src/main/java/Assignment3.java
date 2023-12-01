import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;

public class Assignment3 {
    WebDriver driver = new ChromeDriver();
    public void setWait(String xpath) {
        WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
    }


    public static void main(String[] args) {
        Assignment3 main = new Assignment3();

        main.driver.get("https://rahulshettyacademy.com/loginpagePractise");

        HashMap<String, String> input = new HashMap<>();

        input.put("userName", main.driver.findElement(By.xpath("(//i)[1]")).getText());
        input.put("password", main.driver.findElement(By.xpath("(//i)[2]")).getText());
        main.driver.findElement(By.id("username")).sendKeys(input.get("userName"));
        main.driver.findElement(By.id("password")).sendKeys(input.get("password"));
        main.driver.findElement(By.xpath("//span[text()=' User']/following-sibling::span[@class='checkmark']")).click();

        main.setWait("//div[@class='modal-footer justify-content-center']//button[@id='okayBtn']");
        main.driver.findElement(By.xpath("//div[@class='modal-footer justify-content-center']//button[@id='okayBtn']")).click();

        WebElement dropdown = main.driver.findElement(By.xpath("//select[@class='form-control']"));
        Select type = new Select(dropdown);
        type.selectByVisibleText("Consultant");

        main.driver.findElement(By.id("terms")).click();
        main.driver.findElement(By.id("signInBtn")).click();
        main.setWait("//a[text()='ProtoCommerce Home']");

        List<WebElement> products = main.driver.findElements(By.cssSelector(".card-footer .btn-info"));
        for(int i =0;i<products.size();i++)
        {
            products.get(i).click();
        }

        main.driver.findElement(By.xpath("//a[contains(text(), 'Checkout')]")).click();

    }

}
