package TestRunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "G:\\Automation testing\\HandsOn\\Tagging in Cucumber BDD Junit\\july28_5\\src\\main\\java\\Feature\\Feature.feature"
,glue= {"StepDefinition"}
,dryRun=false
,monochrome=true
,strict=true
,tags= {"@End2End"}

		)
public class TestRunner {

}
