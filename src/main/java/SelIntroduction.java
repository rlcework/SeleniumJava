import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class SelIntroduction {
    public static void main(String[] args) {

        //Invoking Browser
        //Chrome - ChromeDriver -> Methods
        //Firefox - FirefoxDriver -> methods close get
        //safari - SafariDriver -> methods close get
        //Edge - EdgeDriver -> methods close get
        //WebDrover methods +

        //next -> download all driver (e.g chromedriver.exe) can be DL. in websites
        // Not to forget to check the version of your browser

     //   WebDriver driver = new ChromeDriver();
       WebDriver driver = new EdgeDriver();
//        driver = new FirefoxDriver();
//        driver = new SafariDriver();

        //System.setProperty("webdriver.chrome.driver", "C:/Users/Work/SeleniumTraining/webDriver/chromedriver.exe");

        driver.get("https://www.rahulshettyacademy.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();
        //driver.quit();

        //driver.findElement(By.xpath());
        for(int i=0;i< 5; i++) {
        }
    }
}






