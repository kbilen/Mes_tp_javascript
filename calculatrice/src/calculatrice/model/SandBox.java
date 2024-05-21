package calculatrice.model;

import calculatrice.util.DivisionParZeroException;

public class SandBox {
	public static void main(String[] args) throws DivisionParZeroException{
		
		Calculatrice calculatrice = new Calculatrice();
		int dividende =42;
		int diviseur = 2;
		
		int resultat= calculatrice.diviser(dividende,diviseur);
		System.out.println("Le résultat de la divison de "+dividende+" par "+
		diviseur + " est: "+ resultat);
		
	try {
	    Calculatrice calculatrice1 = new Calculatrice();
	    int resultat1 = calculatrice1.diviser(42,0);
	    } catch (Exception e) {
	    System.out.println("La division par zéro est impossible");
	    System.out.println("L'exception capturée est : "+e.getMessage());
	  }
	    
    try {
     	Calculatrice calculatrice2 = new Calculatrice();
     	int resultat1 = calculatrice2.diviser(42,0);
    	} catch (ArithmeticException e) {
        System.out.println("La division par zéro est impossible");
        System.out.println("L'exception capturée est : "+e.getMessage());
    }
    
    
}
}
