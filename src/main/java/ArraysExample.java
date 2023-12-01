import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class ArraysExample {
    public WebDriver driver = new ChromeDriver();
    public final WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

    public static void main(String[] args) throws Exception {
        ArraysExample main = new ArraysExample();
        //main.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        main.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        String[] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot"};
        main.addItems(itemsNeeded);
        main.driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
        main.driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
        main.w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter promo code']")));
        main.driver.findElement(By.xpath("//input[@placeholder='Enter promo code']")).sendKeys("rahulshettyacademy");
        main.driver.findElement(By.className("promoBtn")).click();
        //explicit wait
        main.w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));

        main.driver.findElement(By.cssSelector("span.promoInfo")).getText();

    }
    public void addItems (String[] itemsNeeded) throws InterruptedException {
        List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));
        int j = 0;
        for (int i = 0; i < products.size(); i++) {
            Thread.sleep(5000);
            String[] nameIteration = products.get(i).getText().split("-");
            //for removing excess space left or right .trim();
            String formattedName = nameIteration[0].trim();

            //convert string array to list array
            List itemsNeededList = Arrays.asList(itemsNeeded);

            if (itemsNeededList.contains(formattedName)) {
                System.out.println(formattedName);
                System.out.println("*******************");

                driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
                //Thread.sleep(2000);
                //driver.findElement(By.xpath("//button[contains(text(), 'ADDED')]")).isDisplayed();

                j++;
                if (j == itemsNeeded.length) {
                    break;
                }

            }
        }

    }
}
