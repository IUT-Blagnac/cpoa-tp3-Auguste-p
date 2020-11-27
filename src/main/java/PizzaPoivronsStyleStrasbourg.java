public class PizzaPoivronsStyleStrasbourg extends Pizza {
	
	public PizzaPoivronsStyleStrasbourg() {
		this.nom = "Pizza sauce style Strasbourg et poivrons";
		this.garnitures.add("Mozzarella en lamelles");
	}
	
	@Override
	public void couper() {
		System.out.println("Découpage en parts carrées");
	}
}
