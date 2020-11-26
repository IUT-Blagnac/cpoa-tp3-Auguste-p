import java.util.ArrayList;

/**
 * @author pasero (from O'Reilly Head-First series)
 */
public abstract class Pizza {
	String nom;
	String pate;
	String sauce;
	ArrayList<String> garnitures = new ArrayList<String>();
	
	protected void preparer() {}

	protected void cuire() {}

	protected void couper() {}

	protected void emballer() {}
	
	public String getNom() {
		return this.nom;
	}
}
