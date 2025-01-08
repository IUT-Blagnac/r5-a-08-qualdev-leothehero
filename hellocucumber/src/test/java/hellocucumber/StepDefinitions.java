package hellocucumber;

import io.cucumber.java.en.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions.*;


public class StepDefinitions {
    String today;

    @Given("an example scenario")
    public void anExampleScenario() {
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }

    @Given("today is {string}")
    public void today_is_sunday(String string) {
        today=string;
    }

    @When("I ask whether it's Friday yet")
    public Boolean i_ask_whether_it_s_friday_yet() {
        return today.equals("Friday");//isItFriday(today);
    }
    @Then("I should be told {string}")  
    public void i_should_be_told(String string) {
        assertEquals(string, isItFriday(today)); 
    }

    static String isItFriday(String today) {
        return "Friday".equals(today) ? "TGIF" : "Nope";
    }
}

