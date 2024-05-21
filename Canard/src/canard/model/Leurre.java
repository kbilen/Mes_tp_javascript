package canard.model;

import canard.model.cancan.CanardMuet;
import canard.model.vol.NePasVoler;

public class Leurre extends Canard {
	
	
    public Leurre(String nom) {
        super(nom);
        super.comportementVol = new NePasVoler();
        super.comportementcancan = new CanardMuet();
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
        return "Je suis un  vrai Leurre";
    }
}