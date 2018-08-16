package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "\\Users\\mani\\workspace\\CucumberProject"
		               +"\\src\\main\\java\\Features\\hooks.feature", //the path of the feature files
		glue={"stepDefinitions"}, //the path of the step definition files
	    format= {"pretty","html:test-outout", "junit:target/cucumber-reports/Cucumber.xml"},
		monochrome = true,
		dryRun = false,strict = true//,tags ={"@SmokeTest" , "@RegressionTest"}
)
public class TestRunner {

}
