/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_colas.demangeot;

/**
 *
 * @author 33781
 */
public class BouteilleBiere { //Création d'une classe
//Création des attributs    
    String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;
public void lireEtiquette() {//Création d'une méthode qui affichage les caractéristiques d'une bouteille
    System.out.println("Bouteille de " + nom +" (" + degreAlcool +" degres) \nBrasserie : "+ brasserie ) ;
}

public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {//Création du constructeur
 nom = unNom;
 degreAlcool = unDegre;
 brasserie = uneBrasserie;
 ouverte = false;
}
public boolean Décapsuler() {//Nouvelle méthode qui regarde si la bouteille est déjà ouverte ou non et retourne le résultat
    if (ouverte == false){
    ouverte = true;
    return ouverte; 
    }else if (ouverte == true) {
            System.out.println("Bière déjà ouverte");
            ouverte = false;
            }
        return ouverte;
}
@Override
public String toString() {//Lorsqu'une bouteille est appelée dans un print, le programme retourne maintenant les informations contenues dans cette méthode toString
    String chaine_a_retourner;
chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Ouverte ? ";
if (ouverte == true ) chaine_a_retourner += "oui" ;
else chaine_a_retourner += "non" ;
return chaine_a_retourner ;
}
}