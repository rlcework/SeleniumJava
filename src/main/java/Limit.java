import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Limit {

    private WebDriver driver = new EdgeDriver();

     public static void main(String[] args) {

         Limit limit = new Limit();
         limit.driver.get("http://qaclickacademy.com/practice.php");
         System.out.println(limit.driver.findElements(By.tagName("a")).size());

         //to limit the count you want, use webElement
         WebElement footdriver = limit.driver.findElement(By.id("gf-BIG"));
         System.out.println(footdriver.findElements(By.tagName("a")).size());
    }
}
