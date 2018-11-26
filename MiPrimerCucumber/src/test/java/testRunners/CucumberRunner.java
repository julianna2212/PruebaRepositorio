package testRunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(snippets = SnippetType.CAMELCASE,
features="resources/features",
glue="stepDefinitions",
plugin= {"pretty", "html:target/cucumber-reports"},
monochrome=true)
public class CucumberRunner {

}
