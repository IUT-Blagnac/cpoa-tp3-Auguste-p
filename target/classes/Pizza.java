import java.util.ArrayList;

public abstract class Pizza {
	protected String nom;
	protected String pate;
	protected String sauce;
	protected ArrayList<String> garnitures;

	protected Pizza() {
		this.nom = "";
		this.pate = "";
		this.sauce = "";
		this.garnitures = new ArrayList<String>();
	}

	public void preparer() {
		System.out.println("Préparation de " + this.nom );
		System.out.println("Étalage de la pâte...");
		System.out.println("Ajout de la sauce... ");
		System.out.println("Ajout des garnitures:");
		for (int i=0; i<garnitures.size(); i++) {
			System.out.println(" " + this.garnitures.get(i));
		}
	}

	public void cuire() {
		System.out.println("Cuisson 25 minutes à 180°");
	}

	public void couper() {
		System.out.println("Découpage en parts triangulaires" );
	}

	public void emballer() {
		System.out.println("Emballage dans une boîte officielle");

	}
	public String getNom() {
		return this.nom;
	}
}
