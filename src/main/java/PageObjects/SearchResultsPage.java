package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultsPage {
    private WebElement firstResultTitle;

    public SearchResultsPage(WebDriver driver) {
        this.firstResultTitle = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[9]/div[1]/a[1]/div/div[6]/div[1]"));
    }

    public String getFirstResultTitle(WebDriver driver) {
        return this.firstResultTitle.getText().toLowerCase();
    }
}