public class FabriqueDePizzasBrest extends FabriqueDePizzas {
	static FabriqueDePizzasBrest instance = new FabriqueDePizzasBrest();
	public static FabriqueDePizzasBrest getInstance() {
		
		return instance;
		
	}
	
	public Pizza creerPizza(String type) {
		Pizza Pizza = null;
		if (type.equals("fromage")) {
			Pizza = new PizzaFromageStyleBrest();
		} else if (type.equals("poivron")) {
			Pizza = new PizzaPoivronsStyleBrest();
		} else if (type.equals("grec")) {
			Pizza = new PizzaGrecqueStyleBrest();
		} 
		return Pizza;
	}



}
