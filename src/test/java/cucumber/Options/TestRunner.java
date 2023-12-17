package cucumber.Options;

import io.cucumber.cienvironment.internal.com.eclipsesource.json.Json;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features",plugin = "json:target/jsonReports/cucumber-report.json", glue = {"stepDefinitions"})

//tags = "@DeletePlace" compile test verify

public class TestRunner {



}
