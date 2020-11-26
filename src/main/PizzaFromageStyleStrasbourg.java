public class PizzaFromageStyleStrasbourg extends Pizza {

	protected void preparer() {
		this.garnitures.add("Mozzarella en lamelles");
		super.preparer();
		System.out.print("Pr�paration de " +this.getNom()+ "\nEtalage de la p�te...\nAjout de la sauce...\nAjout des garnitures :\n");
		for (int i=0; i<garnitures.size(); i++) {
			System.out.println(" " + this.garnitures.get(i));
		}
	}

	protected void cuire() {
		super.cuire();
		System.out.println("Cuisson 25 minutes � 180�");	
	}

	protected void couper() {
		super.couper();
		System.out.println("D�coupage en parts carr�es");
	}

	protected void emballer() {
		super.emballer();
		System.out.println("Emballage dans une bo�te officielle");
	}
	
	public String getNom() {
		return "Pizza p�te style Strasbourg et fromage";
	}

}
