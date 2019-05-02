package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebElement searchBar;

    public HomePage(WebDriver driver) {
        this.searchBar = driver.findElement(By.id("searchString"));
    }

    public void searchText(String searchTerm) {
        this.searchBar.sendKeys(searchTerm);
        this.searchBar.sendKeys(Keys.RETURN);
    }
}
