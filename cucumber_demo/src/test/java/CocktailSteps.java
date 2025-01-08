import static org.junit.Assert.assertEquals;

import java.util.List;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CocktailSteps {
    private Order order;

    @Given("{word} who wants to buy {int} drink(s)")
    public void wants_to_buy_drinks(String owner, int nb) {
        order = new Order();
        order.declareOwner(owner);
        for(int i = 0; i < nb; ++i) {
            order.addCocktail();
        } 
    }
    
    @Given("{word} who wants to buy a drink")
    public void wants_to_buy_a_drink(String owner) {
        order = new Order();
        order.declareOwner(owner);
        order.addCocktail();
    }
    
    @When("an order is declared for {word}")
    public void an_order_is_declared(String target) {
        order.declareTarget(target);
    }
    
    @Then("there is no cocktail in the order")
    public void there_is_no_cocktail_in_the_order() {
        List<String> cocktails =  order.getCocktails();
        assertEquals(0, cocktails.size());
    }

    @Then("there is {int} cocktails in the order")
    public void there_is_cocktails_in_the_order(int int1) {
        assertEquals(int1, order.getCocktails().size());
    }

    @When("a message saying {string} is added")
    public void a_message_saying_is_added(String string) {
        order.addMessage(string);
    }

    @Then("the ticket must say {string}")
    public void the_ticket_must_say(String string) {
        assertEquals(string,order.getMessage());
    }
}
