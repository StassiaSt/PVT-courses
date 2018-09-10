package cucumber_tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/feature/SendEmailToGroupOfPeople.feature"},glue = {"src/test/java/cucumber_tests/SendEmailToGroupOfPeopleSteps"})
public class SendEmailToGroupOfPeopleTest {

}
