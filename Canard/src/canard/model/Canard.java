package canard.model;

import canard.model.cancan.ComportementCancan;
import canard.model.vol.ComportementVol;

public class Canard {
	protected String nom;
    protected ComportementVol comportementVol;
    protected ComportementCancan comportementcancan;
    
	public Canard(String nom) {
	    this.nom = nom;
	}

    public String effectuerVol() {
        return comportementVol.voler();
    }
    
    public String effectuerCancan() {
        return comportementcancan.cancaner();
    }


    public String nager() {
        return "Tous les canards flottent ,même les leurres!";
    }

    public String afficher() {
        return "Je suis un canard nommé"+nom;
    }
    
    public String getNom() {
    	return nom;
    }
    
   
    public void changerComportementVol(ComportementVol comportementVol) {
        this.comportementVol = comportementVol;
    }

    public void changerComportementCancan(ComportementCancan comportementCancan) {
        this.comportementcancan = comportementCancan;
    }
 }