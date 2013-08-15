package test;

import com.google.inject.Inject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.zak.Greeter;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class ExampleStepdefs {

	private SharedContext sharedContext;
    private Greeter greeter;
    private String message;

    @Inject
	public ExampleStepdefs(SharedContext sharedContext) {
		this.sharedContext = sharedContext;
	}

    @Given("^I have a greeter$")
    public void I_have_a_greeter() throws Throwable {
        sharedContext.setGreeter(new Greeter("Hello"));
        greeter = sharedContext.getGreeter();
    }

    @When("^the greeter greets \"([^\"]*)\"$")
    public void the_greeter_greets(String greetee) throws Throwable {
        sharedContext.setMessage(greeter.greet(greetee));
    }

    @Then("^I will see the following message:$")
    public void I_will_see_the_following_message(String message) throws Throwable {
        assertThat(sharedContext.getMessage(), equalTo(message));
    }
}