/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superpuissance4_colas.demangeot.dessors;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author 33781
 */
public class Partie {
    private Joueur[]ListeJoueurs = new Joueur[2];
    Joueur joueurCourant;
    PlateauDeJeu grilleDeJeu = new PlateauDeJeu();
    
    public Partie(Joueur premierJoueur, Joueur deuxiemeJoueur){
        ListeJoueurs[0] = premierJoueur;
        ListeJoueurs[0] = deuxiemeJoueur;
    }
    
    public void attribuerCouleurAuxJoueurs(){
        Random r = new Random();
        boolean couleur;
        couleur = r.nextBoolean();
        if (couleur){
            ListeJoueurs[0].affecterCouleur("Rouge");
            ListeJoueurs[1].affecterCouleur("Jaune");
        }else{
            ListeJoueurs[0].affecterCouleur("Jaune");
            ListeJoueurs[1].affecterCouleur("Rouge");
        }
    }
    public void creerEtAffecterJeton(Joueur joueur){
        Jeton [] jetons = new Jeton[30];
        for (int i=0; i<30; i++){
        jetons[i] = new Jeton(joueur.couleur);
        joueur.ajouterJeton(jetons[i]);
        }   
    }
    
    public void placerTrousNoirsEtDesintegrateurs(){
        //Génération des 5 trous noirs et de 3 désintégrateurs sur les trous noirs
        Random l = new Random();
        Random c = new Random();
        int compteur = 0;
        for(int i=0; i<5; i++){
            int ligne_TN = l.nextInt(6);
            int colonne_TN = c.nextInt(7);
            if(compteur <   2){
                if (!grilleDeJeu.placerDesintegrateur(ligne_TN, colonne_TN)){
                    compteur--;
                }
                compteur = compteur + 1;
            }
            if (!grilleDeJeu.placerTrouNoir(ligne_TN, colonne_TN)){
                i--; 
            }
        }
        //On place les trois derniers désintegrateurs
        for(int i=0; i<3; i++){
            int ligne_desint = l.nextInt(6);
            int colonne_desint = l.nextInt(7);
            if (!grilleDeJeu.placerDesintegrateur(ligne_desint, colonne_desint) || !grilleDeJeu.placerTrouNoir(ligne_desint, colonne_desint)){
                i--;
            }
        }
        grilleDeJeu.afficherGrilleSurConsole();
    }
    
    public void initialiserPartie(){
        //Création de joueurs
        Scanner sc = new Scanner(System.in);
        System.out.println("Choix du pseudo du J1 :");
        Joueur J1 = new Joueur(sc.nextLine());
        System.out.println("Choix du pseudo du J2 :");
        Joueur J2 = new Joueur(sc.nextLine());
        ListeJoueurs[0] = J1;
        ListeJoueurs[1] = J2;
        
        attribuerCouleurAuxJoueurs();
        
        System.out.println(J1.nom + " est de couleur " + J1.couleur);
        System.out.println(J2.nom + " est de couleur " + J2.couleur);
        
        creerEtAffecterJeton(ListeJoueurs[0]);
        creerEtAffecterJeton(ListeJoueurs[1]);
        
        placerTrousNoirsEtDesintegrateurs();
}   
    public void lancerPartie(){
        initialiserPartie();
        Random j = new Random();
        int nouveauJoueur = j.nextInt(0,2);
        joueurCourant = ListeJoueurs[nouveauJoueur];
    }
}
