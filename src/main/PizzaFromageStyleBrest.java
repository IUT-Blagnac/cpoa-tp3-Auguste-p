public class PizzaFromageStyleBrest extends Pizza {

	protected void preparer() {
		this.garnitures.add("Parmigiano reggiano rapé");
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
		System.out.println("Découpage en parts triangulaires");
	}

	protected void emballer() {
		super.emballer();
		System.out.println("Emballage dans une boîte officielle");
	}
	
	public String getNom() {
		return "Pizza sauce style Brest et fromage";
	}
}
