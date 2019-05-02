package StepDefinitions;

import PageObjects.HomePage;
import PageObjects.SearchResultsPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class SearchStepDefinitions {
    private WebDriver driver;

    @Before
    public void setUp() {
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        this.driver.quit();
    }

    @Given("I am on TradeMe's home page")
    public void iAmOnTradeMeSHomePage() {
        this.driver.get("https://www.tmsandbox.co.nz/");
    }

    @When("I search for {string}")
    public void iSearchFor(String searchTerm) {
        HomePage homepage = new HomePage(this.driver);
        homepage.searchText(searchTerm);
    }

    @Then("I see results related to {string}")
    public void iSeeResultsRelatedTo(String searchTerm) {
        SearchResultsPage resultsPage = new SearchResultsPage(this.driver);
        String firstResultTitle = resultsPage.getFirstResultTitle(this.driver);
        Assert.assertTrue(firstResultTitle.contains(searchTerm.toLowerCase()));
    }
}