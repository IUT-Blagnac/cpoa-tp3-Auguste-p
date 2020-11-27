import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Test;

public class Tests {

	@Test
	public void FabricationPizzeria() {
		FabriqueDePizzerias FP;
	    Pizzeria PB;

        FP = new FabriqueDePizzerias();
        PB = FP.creer("Brest");
        assertFalse(PB==null);
	}
	
	@Test
	public void FabricationPizzaFromageBrest() {
		FabriqueDePizzasBrest FPB = FabriqueDePizzasBrest.getInstance();
	    Pizza P;

        P = new PizzaFromageStyleBrest();
        P = FPB.creerPizza("fromage");
        assertFalse(P==null);
	}
	
	@Test
	public void FabricationPizzaPoivronBrest() {
		FabriqueDePizzasBrest FPB = FabriqueDePizzasBrest.getInstance();
	    Pizza P;

        P = FPB.creerPizza("poivron");
        assertFalse(P==null);
	}
	
	@Test
	public void GarniturePizza() {
		FabriqueDePizzasBrest FPB = FabriqueDePizzasBrest.getInstance();
	    Pizza P;
	    
	    P = FPB.creerPizza("poivron");
        
        assertTrue(P.garnitures.get(0) == "Parmigiano reggiano rapé");
	}
	
	@Test
	public void NomPizza() {
		FabriqueDePizzasBrest FPB = FabriqueDePizzasBrest.getInstance();
	    Pizza P;
	    
	    P = FPB.creerPizza("poivron");
        
        assertTrue(P.getNom() == "Pizza sauce style brest et poivrons");
	}
}
