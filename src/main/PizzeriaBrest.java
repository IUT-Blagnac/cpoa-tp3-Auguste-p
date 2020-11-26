public class PizzeriaBrest extends Pizzeria {

	Pizza pizza;
	
    /**
     * @param type
     * @return a Pizza object according to the type
     */
    public Pizza commanderPizza(String type) {
    	
	if (type.equals("fromage")) {
	        pizza = new PizzaFromageStyleBrest();
	    } else if (type.equals("grecque")) {
	    	pizza =  new PizzaGrecque();
	    } else {
	    	pizza =  new PizzaPoivrons();
    }
	    
    pizza.preparer();
    pizza.cuire();
    pizza.couper();
    pizza.emballer();

    return pizza;
    }    
}
