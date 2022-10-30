/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_colas.demangeot;

/**
 *
 * @author 33781
 */
public class TP2_Bieres_COLASDEMANGEOT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Création de l'objet BouteilleBiere et de trois références objets
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls" ,7.0 , "Dubuisson");
        uneBiere.ouverte = false ;
        uneBiere.lireEtiquette();//Appelle de la méthode lirEtiquette
        
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe",6.6,"Abbaye de Leffe");
        autreBiere.ouverte = false ;
        autreBiere.lireEtiquette();
        System.out.println(autreBiere) ;//Affichage des caractéristiques à travers la méthode toString
        
        BouteilleBiere TroisièmeBiere = new BouteilleBiere ("Corona", 5.8 , "Modelo" );
        TroisièmeBiere.lireEtiquette();
        TroisièmeBiere.ouverte = true ;
        System.out.println(TroisièmeBiere);
        TroisièmeBiere.Décapsuler();//Appelle de la méthode Décapsuler
        
    }
    
}