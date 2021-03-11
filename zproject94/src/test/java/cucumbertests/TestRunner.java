package cucumbertests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"html:target/report_html.html","junit:target/report_xml.xml","json:target/report_json.json"},
features = "features",
glue = { "stepdefinitions" },
monochrome=true,
dryRun=false,
strict=true,
tags="@fun")
public class TestRunner {

}
