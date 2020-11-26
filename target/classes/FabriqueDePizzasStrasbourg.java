
public class FabriqueDePizzasStrasbourg extends FabriqueDePizzas {
	
static FabriqueDePizzasStrasbourg instance = new FabriqueDePizzasStrasbourg();
	
	public static FabriqueDePizzasStrasbourg getInstance() {
		
		return instance;
	}
	
	public Pizza creerPizza(String type) {
		Pizza Pizza = null;
		if (type.equals("fromage")) {
			Pizza = new PizzaFromageStyleStrasbourg();
		} else if (type.equals("poivron")) {
			Pizza = new PizzaPoivronsStyleStrasbourg();
		} else if (type.equals("grec")) {
			Pizza = new PizzaGrecqueStyleStrasbourg();
		} 
		return Pizza;
	}

}
