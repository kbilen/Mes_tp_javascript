package canard.model;


import canard.model.cancan.Coincoin;
import canard.model.vol.NePasVoler;

public class CanardEnPlastique extends Canard {

	
    public CanardEnPlastique(String nom) {
        super(nom);
        super.comportementVol = new NePasVoler();
        super.comportementcancan = new Coincoin();
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
        return "Je suis un vrai Canard en Plastique nommé";
    }
}