package montagne.application;

import java.util.ArrayList;
import java.util.Collections;

import montagne.metier.ChaineDeMontagne;
import montagne.metier.Sommet;

import montagne.metier.ComparateurChaineDeMontagne;

public class MontagneMain {

	public static void main(String[] args) {
        ArrayList<Sommet> sommets = new ArrayList<>();
        
        Sommet sommet1= new Sommet("Mont Blanc",4809,ChaineDeMontagne.MASSIF_CENTRAL);
        sommets.add(sommet1);
        
        Sommet sommet2= new Sommet("Aiguille Des Grands Montets",3295,ChaineDeMontagne.MONTBLANC);
        sommets.add(sommet2);
        
        Sommet sommet3= new Sommet("La Rhune",905,ChaineDeMontagne.PYRENEES);
        sommets.add(sommet3);
        
        Sommet sommet4= new Sommet("Pic du Midi",2877,ChaineDeMontagne.PYRENEES);
        sommets.add(sommet4);
        
        Sommet sommet5= new Sommet("Pic d'Aneto",3404,ChaineDeMontagne.PYRENEES);
        sommets.add(sommet5);
        
        Sommet sommet6= new Sommet("Pic du Canigou",2785,ChaineDeMontagne.PYRENEES);
        sommets.add(sommet6);
        
        Sommet sommet7= new Sommet("Puy de Sancy",1579,ChaineDeMontagne.MASSIF_CENTRAL);
        sommets.add(sommet7);
        
        Sommet sommet8= new Sommet("Puy de Dôme",1465,ChaineDeMontagne.MASSIF_CENTRAL);
        sommets.add(sommet8);
        
        Sommet sommet9= new Sommet("Le Grand ballon",1424,ChaineDeMontagne.VOSGES);
        sommets.add(sommet9);
        
        
        //Collections.sort(sommets, new SommetComparateurAltitude());
        
        Collections.sort(sommets, new ComparateurChaineDeMontagne());
        
        for (Sommet sommet : sommets) {
        	System.out.println(sommet.description());

        }
	}
}
