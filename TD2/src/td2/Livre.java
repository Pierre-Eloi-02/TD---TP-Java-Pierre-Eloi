package td2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pierr
 */
public class Livre {
    private String titre; 
    // On va sur source et on insert code, constructor, et on coche les deux cases. 
    public Livre(String titre, String genre) {
        this.titre = titre;
        this.genre = genre;
    }
    private String genre; 
    // On va sur source et insert code, getter et on coche les deux cases. 
    public String getTitre() {
        return titre;
    }

    public String getGenre() {
        return genre;
    }
    // Source, toString()
    @Override
    public String toString() {
        return "Livre{" + "titre=" + titre + ", genre=" + genre + '}';
    }
    
}
