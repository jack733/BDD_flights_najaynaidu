package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "C:\\iLearn\\BBD\\Features"

,glue= {"BDD.BBD.StepDefinations"}
)

public class Runner {

}
