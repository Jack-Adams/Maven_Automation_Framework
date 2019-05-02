package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultsPage {
    private WebElement firstResultTitle;

    public SearchResultsPage(WebDriver driver) {
        this.firstResultTitle = driver.findElement(By.className("title"));
    }

    public String getFirstResultTitle(WebDriver driver) {
        return this.firstResultTitle.getText().toLowerCase();
    }
}