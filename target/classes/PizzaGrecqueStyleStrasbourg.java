public class PizzaGrecqueStyleStrasbourg extends Pizza {
	
	public PizzaGrecqueStyleStrasbourg() {
		this.nom = "Pizza sauce style Strasbourg et grecque";
		this.garnitures.add("Mozzarella en lamelles");
	}
	
	@Override
	public void couper() {
		System.out.println("Découpage en parts carrées");
	}
}
