package RunFeature;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"classpath:features"},
        monochrome = false,
        glue = {"helpers", "stepsDefinitions"},
        plugin = {"pretty", "html:target/cucumber-html-report.html", "json:target/cucumber.json"}
)
public class RunFeatureFile {

}
