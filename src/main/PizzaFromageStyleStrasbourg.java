public class PizzaFromageStyleStrasbourg extends Pizza {

	protected void preparer() {
		this.garnitures.add("Mozzarella en lamelles");
		super.preparer();
		System.out.print("Préparation de " +this.getNom()+ "\nEtalage de la pâte...\nAjout de la sauce...\nAjout des garnitures :\n");
		for (int i=0; i<garnitures.size(); i++) {
			System.out.println(" " + this.garnitures.get(i));
		}
	}

	protected void cuire() {
		super.cuire();
		System.out.println("Cuisson 25 minutes à 180°");	
	}

	protected void couper() {
		super.couper();
		System.out.println("Découpage en parts carrées");
	}

	protected void emballer() {
		super.emballer();
		System.out.println("Emballage dans une boîte officielle");
	}
	
	public String getNom() {
		return "Pizza pâte style Strasbourg et fromage";
	}

}
