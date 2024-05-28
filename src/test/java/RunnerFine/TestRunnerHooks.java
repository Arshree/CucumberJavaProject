package RunnerFine;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", 
		glue={"StepDefnitions"},
		tags="@Hooks",
plugin= {"pretty","html:target/HtmlReports/report.html",
		"pretty","json:target/JsonReports/report.json",
		"pretty","junit:target/JunitReports/report.xml"}
		)
public class TestRunnerHooks {

	
}
