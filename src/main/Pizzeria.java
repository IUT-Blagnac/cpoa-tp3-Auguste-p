/**
 * @author pasero (from O'Reilly Head-First series)
 * @depend - * - Pizza
 */
public abstract class Pizzeria {
	
    Pizza pizza;
	
    /**
     * @param type
     * @return a Pizza object according to the type
     */
    public Pizza commanderPizza(String type) {
    
    pizza.preparer();
    pizza.cuire();
    pizza.couper();
    pizza.emballer();

    return pizza;
    }
}