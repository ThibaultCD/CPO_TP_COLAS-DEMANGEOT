/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superpuissance4_colas.demangeot.dessors;

import java.util.Random;

/**
 *
 * @author 33781
 */
public class Partie {
    private Joueur[]ListeJoueurs = new Joueur[2];
    private Joueur joueurCourant;
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
        Jeton [] jetons = new Jeton[30];
        for (int i=0; i<30; i++){
        jetons[i] = new Jeton(joueur.couleur());
        joueur.ajouterJeton(jetons[i]);
        }   
    }
    
    public void placerTrousNoirsEtDesintegrateurs(){
        Random l = new Random();
        Random c = new Random();
        for(int i=0; i<3; i++){
            int ligne = l.nextInt(0,6);
            int colonne = c.nextInt(0,7);
            if (plateau.presenceTrouNoir(ligne, colonne) == false && plateau.presenceDesintegrateur(ligne, colonne) == false){
                plateau.placerTrouNoir(ligne, colonne);
                plateau.placerDesintegrateur(ligne,colonne);
            }else{
                i=-1;
            }
        }
        for(int j=0; j<2; j++){
            int ligne = l.nextInt(0,6);
            int colonne = c.nextInt(0,7);
            if(plateau.presenceDesintegrateur(ligne, colonne) == false){
                plateau.placerDesintegrateur(ligne, colonne);
            }else{
                j=-1;
            }
        }
        for(int k=0; k<2; k++){
            int ligne = l.nextInt(0,6);
            int colonne = c.nextInt(0,7);
            if(plateau.presenceTrouNoir(ligne, colonne) == false && plateau.presenceDesintegrateur(ligne, colonne) == false){
                plateau.placerTrouNoir(ligne, colonne);
            }else{
                k=-1;
            }
        }        
    }
    
    public void initialiserPartie(){
        attribuerCouleurAuxJoueurs();
        creerEtAffecterJeton(ListeJoueurs[0]);
        creerEtAffecterJeton(ListeJoueurs[1]);
        placerTrousNoirsEtDesintegrateurs();
    }
    
    public void lancerPartie(){
        initialiserPartie();
        Random j = new Random();
        int nouveauJoueur = j.nextInt(0,2);
        joueurCourant = ListeJoueurs[nouveauJoueur];
        while(
            
        }
    }
}
