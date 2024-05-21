package calculatrice.application;

import calculatrice.model.Calculatrice;
import calculatrice.util.DivisionParZeroException;

public class main {
	
	public static void main(String[] args) throws DivisionParZeroException{
		Calculatrice calculatrice = new Calculatrice();
		
		
		int result1 = calculatrice.additionner(2,4);
	
		int result2 = calculatrice.soustraire(2,4);
		
		int resutl3 = calculatrice.multiplier(2,4);
	
		try {

			int restult4 = calculatrice.diviser(2,0);
			} catch (Exception e) {
			System.out.println("Le résultat de la divison est impossible");
			}
	}
}
