/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superpuissance4_colas.demangeot.dessors;

/**
 *
 * @author 33781
 */
public class Partie {
    private Joueur[]ListeJoueurs = new Joueur[2];
    private Joueur JoueurCourant;
    private PlateauDeJeu plateau;
    
    public Partie(Joueur premierJoueur, Joueur deuxiemeJoueur){
        ListeJoueurs[0] = premierJoueur;
        ListeJoueurs[0] = deuxiemeJoueur;
    }
    
    public void attribuerCouleurAuxJoueurs(){
        ListeJoueurs[0].affecterCouleur("Rouge");
        ListeJoueurs[1].affecterCouleur("Jaune");
    }
    
    public void creerEtAffecterJeton(Joueur joueur){
        
        
    }
    
}
