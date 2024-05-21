package calculatrice.model;

public class Calculatrice {
	
		public int additionner(int terme1,int terme2) {
			return terme1 + terme2;
		}
		
		public int soustraire(int terme1,int terme2) {
			return terme1 - terme2;
		}
		
		public int multiplier(int terme1,int terme2) {
			return terme1 * terme2;
		}
		public int diviser(int terme1,int terme2) {
	        if (terme2 == 0) {
	            throw new IllegalArgumentException("Division impossible car le diviseur est égal à zéro");
	        }
			return terme1 / terme2;
		}
}
