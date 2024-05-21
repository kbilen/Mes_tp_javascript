package montagne.metier;

import java.util.Comparator;

public class SommetComparateurAltitude implements Comparator<Sommet> {
    @Override
    public int compare(Sommet s1, Sommet s2) {
    	
        int comparaisonAltitude = Integer.compare(s1.altitude(), s2.altitude());
        if (comparaisonAltitude != 0) {
            return comparaisonAltitude;
        }
        
        return Integer.compare(s1.altitude(), s2.altitude());
    }	
}		
