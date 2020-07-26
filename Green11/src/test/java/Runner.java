import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"\\src\\main\\resources\\GreenGui.feature"}, 
		plugin = {"pretty", "html:target/cucumber-html-reports"},
		monochrome = true,
		glue = {"\\src\\test\\java\\Steps.java"}
		)
public class Runner {

}
