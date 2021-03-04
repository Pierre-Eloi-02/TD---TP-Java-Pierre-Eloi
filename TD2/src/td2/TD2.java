/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td2;

/**
 *
 * @author pierr
 */
public class TD2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Livre []tab = new Livre[5]; 
        Livre l1 = new Livre("I, Robot", "Science-Fiction"); //La classe Livre doit ABSOLUMENT être dans le même package que TD2 pour l'utiliser. 
        Livre l2 = new Livre("10 petits nègres", "Policier");
        /*System.out.println("titre :" +l1.getTitre());
        System.out.println("genre :" + l1.getGenre());
        System.out.println("titre :" +l2.getTitre()); 
        System.out.println("genre :" + l2.getGenre());*/
        tab[0] = l1;
        tab[1] = l2; 
        tab[2] = new Livre("World War Z", "Science-Fiction");
        tab[3] = new Livre("Mort sur le Nil", "Policier");
        tab[4] = new Livre("Prométhée", "Mythologie");
        
        for(int i = 0; i<tab.length; i++) {
            System.out.println("Titre:" + tab[i].getTitre()+ "" + "Genre :" + tab[i].getGenre()); 
        }
        
        IHM_Bibliothèque ihm = new IHM_Bibliothèque(tab); 
        ihm.setVisible(true);
    }
    
}
