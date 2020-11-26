public class PizzaFromageStyleStrasbourg extends Pizza {
	
	public PizzaFromageStyleStrasbourg() {
		this.nom = "Pizza sauce style Strasbourg et fromage";
		this.garnitures.add("Mozzarella en lamelles");	
	}
	
	@Override
	public void couper() {
		System.out.println("Découpage en parts carrées");
	}
}
