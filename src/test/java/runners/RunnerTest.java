package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:target/cucumber"},
            features = "classpath:features",
			glue = {"steps"},
			publish = true,
			snippets = SnippetType.CAMELCASE,
			monochrome = true,  
			//tags = "",
			dryRun = false)
public class RunnerTest {
	

}
