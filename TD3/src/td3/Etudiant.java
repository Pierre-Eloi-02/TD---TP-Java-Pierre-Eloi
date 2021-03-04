package td3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pierr
 */
public class Etudiant {

    private String nom;
    private double[] notes = new double[50];
    private int nbNotes = 0;

    public Etudiant(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void ajouterNote(double nouvelleNote) {

        notes[nbNotes] = nouvelleNote;
        nbNotes++;
    }

    public double getMoyenne() {
        double somme = 0;
        for (int i = 0; i < nbNotes; i++) {
            somme += notes[i];
        }
        return somme / nbNotes;

    }

}
