package cucumber_tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/feature/FindElements.feature"},glue = {"src/test/java/cucumber_tests/FindElementsSteps"})
public class FindElementsTest {

}