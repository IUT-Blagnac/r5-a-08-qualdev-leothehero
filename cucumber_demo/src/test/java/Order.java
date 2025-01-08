import java.util.ArrayList;
import java.util.List;

public class Order {
    String owner;
    String target;
    List<String> cocktails;
    String message = null;
    
    
    public Order() {
        cocktails = new ArrayList();
    }

    public void declareOwner(String owner) {
        this.owner = owner;
    }

    public void addCocktail() {
        cocktails.add(owner);
    }

    public void declareTarget(String target) {
        this.target = target;
        cocktails.removeAll(cocktails);
    }

    public List<String> getCocktails() {
        return cocktails;
    }

    public void addMessage(String string) {
        message = "From " + owner + " to " + target +": " + string;
    }

    public String getMessage() {
        return message;
    }

}
