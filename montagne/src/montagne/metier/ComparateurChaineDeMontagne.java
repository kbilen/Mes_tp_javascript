package montagne.metier;

import java.util.Comparator;

public class ComparateurChaineDeMontagne implements Comparator<Sommet> {
    @Override
    public int compare(Sommet s1, Sommet s2) {
    	
        int comparaisonChaineDeMontagne = s1.chaine().compareTo(s2.chaine());
        if (comparaisonChaineDeMontagne != 0) {
            return s1.nom().compareTo(s2.nom());
        }
        
        return comparaisonChaineDeMontagne;
    }
}
