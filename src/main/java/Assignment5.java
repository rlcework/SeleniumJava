import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment5 {

    public static void main (String [] args) throws InterruptedException {

        WebDriver driver=new EdgeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Nested Frames")).click();

        driver.switchTo().frame(0);
        driver.switchTo().frame(1);
        System.out.println(driver.findElement(By.xpath("//div[text()='MIDDLE']")).getText());

    }
}
