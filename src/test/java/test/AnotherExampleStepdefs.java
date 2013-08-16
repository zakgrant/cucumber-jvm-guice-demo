package test;

import com.google.inject.Inject;
import cucumber.api.java.en.When;
import org.zak.Greeter;

public class AnotherExampleStepdefs {

    private SharedContext sharedContext;
    private Greeter greeter;

    @Inject
    public AnotherExampleStepdefs(SharedContext sharedContext) {
        this.sharedContext = sharedContext;
        this.greeter = sharedContext.getGreeter();
    }

    @When("^the greeter greets to \"([^\"]*)\"$")
    public void the_greeter_greets(String greetee) throws Throwable {
        sharedContext.setMessage(greeter.greet(greetee));
    }
}