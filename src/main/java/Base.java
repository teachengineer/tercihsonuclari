import com.google.common.util.concurrent.Uninterruptibles;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Base {


     static WebDriver driver;
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver");

        driver=new ChromeDriver();

        driver.get("https://sonuc.osym.gov.tr/SonucSec.aspx");

        Select select=new Select(driver.findElement(By.id("cmbSinavTipi")));

        select.selectByVisibleText("YKS");

        WebElement ara=driver.findElement(By.id("btnBul"));
        Uninterruptibles.sleepUninterruptibly(2,TimeUnit.SECONDS);
        ara.click();
        Uninterruptibles.sleepUninterruptibly(15,TimeUnit.SECONDS);
        driver.quit();

    }
}
