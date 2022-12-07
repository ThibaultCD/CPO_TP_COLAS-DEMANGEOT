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
    Joueur[]ListeJoueurs = new Joueur[2];
    Joueur joueurCourant;
    PlateauDeJeu grilleDeJeu = new PlateauDeJeu();
    
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
    
    public Joueur ProchainJoueur(Joueur un_joueur){
        if (ListeJoueurs[0] == joueurCourant){
            return ListeJoueurs[1];
        }
        return ListeJoueurs[0];
    }
    
    public void creerEtAffecterJeton(Joueur joueur){
        Jeton [] jetons = new Jeton[30];
        for (int i=0; i<30; i++){
        jetons[i] = new Jeton(joueur.couleur);
        joueur.ajouterJeton(jetons[i]);
        }   
    }
    
     public void placerTrousNoirsEtDesintegrateurs() {
        //Génération des 5 trous noirs et de 3 désintégrateurs sur les trous noirs
        Random l = new Random();
        Random c = new Random();
        int compteur = 0;
        for (int i = 0; i < 5; i++) {
            int ligne_TN = l.nextInt(6);
            int colonne_TN = c.nextInt(7);
            if (compteur < 2) {
                if (!grilleDeJeu.placerDesintegrateur(ligne_TN, colonne_TN)) {
                    compteur--;
                }
                compteur = compteur + 1;
            }
            if (!grilleDeJeu.placerTrouNoir(ligne_TN, colonne_TN)) {
                i--;
            }
        }
        //On place les trois derniers désintegrateurs
        for (int i = 0; i < 3; i++) {
            int ligne_desint = l.nextInt(6);
            int colonne_desint = l.nextInt(7);
            if (grilleDeJeu.presenceDesintegrateur(ligne_desint, colonne_desint) == true){
                i--;
            }else{
                grilleDeJeu.grille[ligne_desint][colonne_desint].placerDesintegrateur();
                i++;
            }
        }
    }
    int menu_joueur(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Que voulez-vous faire ?");
        System.out.println("1) Jouer un jeton");
        System.out.println("2) Récuperer un jeton");
        System.out.println("3) Désintegrer un jeton");
        int choix = sc.nextInt();
        while (choix >3 || choix < 1){
            System.out.println("Erreur : Entrer un choix qui existe :");
            choix = sc.nextInt();
        }
        return choix;
    }
    
    public void jouerJeton(){
        Scanner sc = new Scanner(System.in);
        boolean resultatAction;
        System.out.println("Veuillez saisir une colonne :");
        int colonne = sc.nextInt() - 1;
        while (colonne > 6 || colonne < 0){
            System.out.println("Erreur : veuillez saisir une autre colonne :");
            colonne = sc.nextInt() - 1;
        }
        resultatAction = grilleDeJeu.ajouterJetonDansColonne(joueurCourant, colonne);
        while (!resultatAction){
            System.out.println("La colonne est pleine, veuillez saisir une autre colonne :");
            colonne = sc.nextInt() - 1;
            resultatAction = grilleDeJeu.ajouterJetonDansColonne(joueurCourant, colonne);
        }
    }
    
    public boolean recup_jeton(){
        int colonne;
        int ligne;
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir les coordonnées du jeton à récupérer :");
        System.out.println("Veuillez saisir la colonne :");
        colonne = sc.nextInt() - 1;
        while (colonne > 6 || colonne < 0){
            System.out.println("Erreur : veuillez saisir une colonne valide :");
            colonne = sc.nextInt() - 1;
        }
        System.out.println("Veuillez saisir la ligne :");
        ligne = sc.nextInt() - 1;
        while (ligne > 5 || ligne < 0){
            System.out.println("Erreur : veuillez saisir une ligne valide :");
            ligne = sc.nextInt() - 1;
        }
        if (grilleDeJeu.grille[ligne][colonne].jetonCourant != null && !"vide".equals(grilleDeJeu.grille[ligne][colonne].lireCouleurDuJeton())){
            joueurCourant.ajouterJeton(grilleDeJeu.recupererJeton(ligne, colonne));
            grilleDeJeu.tasserLigne(ligne);
            return true;
        }else{
            return false;
        }
    }
        
        public boolean desing_jeton(){
            if (joueurCourant.nombreDesintegrateur==0){
                return false;
            }
            int colonne;
            int ligne;
            Scanner sc = new Scanner(System.in);
            System.out.println("Veuillez saisir les coordonnées du jeton à désintegrer :");
            System.out.println("Veuillez saisir la colonne :");
            colonne = sc.nextInt() - 1;
            while (colonne >6 || colonne <0){
                System.out.println("Erreur : veuillez saisir une colonne valide :");
                colonne = sc.nextInt() - 1;
            }
            System.out.println("Veuillez saisir la ligne :");
            ligne = sc.nextInt() - 1;
            while (ligne >5 || ligne <0){
                System.out.println("Erreur : veuillez saisir une ligne valide :");
                ligne = sc.nextInt() - 1;
            }
            if (null != grilleDeJeu.grille[ligne][colonne].jetonCourant && !"vide".equals(grilleDeJeu.grille[ligne][colonne].lireCouleurDuJeton())){
                grilleDeJeu.supprimerJeton(ligne, colonne);
                grilleDeJeu.tasserLigne(ligne);
                joueurCourant.utiliserDesintegrateur();
                return true;
            }else{
                return false;
            }
        }
    
    public boolean tour_de_jeu(){
        System.out.println("C'est à " + joueurCourant.nom + " de jouer (" + joueurCourant.couleur + ")");
        System.out.println("Il vous reste " + joueurCourant.reserveJetons + " jetons");
        System.out.println("Il vous reste " + joueurCourant.nombreDesintegrateur + " désintégrateurs");
        int choix = menu_joueur();
        switch (choix){
            case 1:
                jouerJeton();
                return true;
            case 2:
                if (!recup_jeton()){
                    System.out.println("Vous avez soit un jeton qui n'est pas le vôtre soit un endroit sans jeton");
                    return false;
                }
                return true;
            case 3:
                if (!desing_jeton()){
                    System.out.println("Vous avez soit saisi un jeton qui est le vôtre soit vous n'avez pas de désintegrateur");
                    return false;
                }
                return true;
        }
        return true;
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
        
        Random r = new Random();
        boolean le_premier = r.nextBoolean();
        if (le_premier){
            joueurCourant = ListeJoueurs[0];
        }else{
            joueurCourant = ListeJoueurs[1];
        }
        
        placerTrousNoirsEtDesintegrateurs();
        
        
        grilleDeJeu.afficherGrilleSurConsole();
    }
    
    public void lancerPartie(){
        initialiserPartie();
    }
}
