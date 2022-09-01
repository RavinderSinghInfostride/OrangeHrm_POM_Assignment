package OrangeHrm.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddUserPage {
    WebDriver driver;
    By userRoleDropdown = By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]");
    By employeeName = By.xpath("(//div/input)[2]");
    By statusDropdown = By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[2]");
    By username = By.xpath("(//div/input[@class='oxd-input oxd-input--active'])[2]");
    By password = By.xpath("(//div/input[@type='password'])[1]");
    By confirmPassword = By.xpath("(//div/input[@type='password'])[2]");
    By saveButton = By.xpath("//button[@type='submit']");

    public AddUserPage(WebDriver driver) {
        this.driver = driver;
    }

    public void AddUser() {
        driver.findElement(userRoleDropdown).click();
        driver.findElement(By.xpath("//*[contains(text(),'Admin')]")).click();
        driver.findElement(employeeName).sendKeys("Charlie Carter");
        driver.findElement(statusDropdown).click();
        driver.findElement(By.xpath("//*[contains(text(),'Enabled')]")).click();
        driver.findElement(username).sendKeys("AdminRavinder");
        driver.findElement(password).sendKeys("Admin1234@");
        driver.findElement(confirmPassword).sendKeys("Admin1234@");
        driver.findElement(saveButton).click();
    }
}
