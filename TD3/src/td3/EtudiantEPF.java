/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td3;

/**
 *
 * @author pierr
 */
public class EtudiantEPF extends Etudiant{
    private char groupe; 
    public EtudiantEPF(String nom, char groupe) {
        super(nom); // chercher le nom de l'étudiant dans la class du dessus. 
        this.groupe = groupe;
    }

    public char getGroupe() {//On utilise un getter pour pouvoir utiliser le char groupe qui est privé initiallement. 
        return groupe;
    }
    
}
