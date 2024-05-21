package calculatrice.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatriceTest {

    @Test
    public void testAddition() {
        Calculatrice calculatrice = new Calculatrice();
        int addition = calculatrice.additionner(2, 3);
        assertEquals(5,addition);
    }

    @Test
    public void testSubtraction() {
    	Calculatrice calculatrice = new Calculatrice();
    	int soustraire = calculatrice.soustraire(4, 3);
        assertEquals(1,soustraire);
    }

    @Test
    public void testMultiplication() {
    	Calculatrice calculatrice = new Calculatrice();
    	int multiplier = calculatrice.multiplier(5, 3);
        assertEquals(15,multiplier);
    }

    @Test
    public void testDivision() {
    	Calculatrice calculatrice = new Calculatrice();
    	int division = calculatrice.diviser(2, 1);
        assertEquals(2, division);
    }
 

}
