package OrangeHrm.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdminPage {
    WebDriver driver;

    By addButton = By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']");
    By userRoleDropdown = By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]");
    By employeeName = By.xpath("//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']");
    By searchButton = By.xpath("//div[@class='oxd-form-actions']/button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");

    public AdminPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAddButton() {
        driver.findElement(addButton).click();
    }

    public void searchEmployee() {
        driver.findElement(userRoleDropdown).click();
        driver.findElement(By.xpath("//*[contains(text(),'Admin')]")).click();

        driver.findElement(employeeName).sendKeys("Charlie Carter");
        driver.findElement(searchButton).click();
    }
}
