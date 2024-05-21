package canard.model;

import canard.model.cancan.Cancan;
import canard.model.vol.VolerAvecDesAiles;

public class Colvert extends Canard {

	
    public Colvert(String nom) {
        super(nom);
        super.comportementVol = new VolerAvecDesAiles();
        super.comportementcancan = new Cancan();
    }
    
    @Override
    public String effectuerVol() {
       return super.effectuerVol();
    }
    
    @Override
    public String effectuerCancan() {
       return super.effectuerCancan();
    }
    
    @Override
    public String afficher() {
        return "Je suis un  vrai Colvert ";
    }
}
