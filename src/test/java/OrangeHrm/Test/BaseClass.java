package OrangeHrm.Test;

import OrangeHrm.Pages.PageFactory;
import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class BaseClass {
    protected static PageFactory pageFactory;
    static WebDriver driver;

    public static void setup() {
        driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        pageFactory = new PageFactory(driver);
    }

    public static void close() {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.close();
    }

    public static void verification(String locator, String expected) {
        String actual = driver.findElement(By.xpath(locator)).getText();
        Assert.isTrue(actual.equals(expected), "Expected result does not match with actual result");
    }

}
