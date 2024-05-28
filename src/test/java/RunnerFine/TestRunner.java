package RunnerFine;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
glue = {"StepDefnitions"},
tags = "@smokeFeature",
monochrome = true,
plugin = {"pretty","junit:target/JunitReports/report.xml",
		"pretty","html:target/HtmlReports/report.html",
		"pretty","json:target/JsonReports/report.json"}

)
public class TestRunner {

}
