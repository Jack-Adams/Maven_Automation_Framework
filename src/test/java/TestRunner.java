import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/resources",
        glue = {"StepDefinitions"}
)

public class TestRunner extends AbstractTestNGCucumberTests {
}