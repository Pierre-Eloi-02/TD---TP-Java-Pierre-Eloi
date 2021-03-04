/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td3;

import java.util.Random; //importation class random

/**
 *
 * @author pierr
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*EtudiantEPF e1 = new EtudiantEPF("Bob",'C');  //on rajoute EPF pour retrouver EtudiantEPF de la class EtudiantEPF.java. Le groupe doit aussi être indiqué, donc 'C'. 
        e1.ajouterNote(15);
        e1.ajouterNote(3);
        e1.ajouterNote(10); 
        e1.ajouterNote(14);
        e1.ajouterNote(8);
        System.out.println("l'étudiant s'appelle: "+e1.getNom());
        System.out.println("Sa moyenne est : "+e1.getMoyenne());
        System.out.println("Son groupe est ; "+e1.getGroupe());*/
        
        EtudiantEPF[]tableau = new EtudiantEPF[25];
        Random hasard = new Random();
        for(int i = 0; i<tableau.length; i++) {
            tableau[i] = new EtudiantEPF("e"+i,(char)(hasard.nextInt(4)+65)); //code aski du a=65, code du b=66, etc..
            for (int j=0; j<5; j++){
                tableau[i].ajouterNote(hasard.nextInt(21));
            }
            
        
        }
        for (int i=0; i<tableau.length; i++) {
            System.out.println(tableau[i].getNom()+""+tableau[i].getGroupe()+""+tableau[i].getMoyenne()); 
        }
        IHMEtudiant ihm = new IHMEtudiant();
        ihm.setTableau(tableau); 
        ihm.affichage();
        ihm.setVisible(true);
        
    }
    
}
