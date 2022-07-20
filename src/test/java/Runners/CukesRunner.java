package Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java"},
        glue = {"StepDefinitions"},
        plugin = {"pretty",
                "json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun: target/rerun.txt",
                "html:target/site/cucumber-pretty",
                "usage:target/cucumber-usage.json"},

        dryRun = false
)
public class CukesRunner {


}
