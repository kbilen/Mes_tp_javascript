package farwest;


class Bandit extends PersonnageFarWest {
	private final double taille;
	private boolean estEnPrison;
	
	
	public Bandit(String prenom, String nom, double taille) {
	   super(prenom, nom);
	   this.taille = taille;
	   this.estEnPrison = false;
	}
	
	
	public void faireUnBraquage() {
		//TODO
	}
	
	
	public void mettreEnPrison() {
		//TODO
	}
	
	
	public void libererDePrison() {
	   //TODO
	}
}
