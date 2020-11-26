/**
 * @author pasero (from O'Reilly Head-First series)
 * @depend - * - Pizza
 */
public abstract class Pizzeria {
	
	FabriqueDePizzas fabrique ;
	
	public Pizza commanderPizza(String string) {
		
		Pizza instance = fabrique.creerPizza(string);

		instance.preparer();
		instance.cuire();
		instance.couper();
		instance.emballer();

		return instance;
	}
		
	protected Pizzeria creer(String name) {
		Pizzeria Pizzeria = null;
		if (name.equals("brest")) {
			Pizzeria = new PizzeriaBrest();
		} else if (name.equals("strasbourg")) {
			Pizzeria = new PizzeriaStrasbourg();
		} 
		return Pizzeria;
	}
	
}