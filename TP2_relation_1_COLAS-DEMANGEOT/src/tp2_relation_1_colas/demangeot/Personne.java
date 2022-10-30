/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_colas.demangeot;

/**
 *
 * @author 33781
 */
public class Personne {//Création d'une classe
    String Prenom;
    String Nom;
    int nbVoitures;
    Voiture[] liste_voitures;
        
    public Personne(String prenom, String nom){//Création d'un constructeur    
        Prenom = prenom;
        Nom = nom;
        nbVoitures = 0;
        liste_voitures = new Voiture[3];
    }
    
        @Override
    public String toString(){//Création d'une méthode
        return "Prenom : " + Prenom + " Nom : " + Nom + " Possede : " + nbVoitures + " voitures";
    }
    
    public boolean ajouter_voiture(Voiture voiture_a_ajouter){//Création d'une méthode pour automatiser l'ajout d'une voiture
        if (nbVoitures < 3 & voiture_a_ajouter.Proprietaire == null){//Vérification que le propriétaire à moins de trois voitures et que la voiture n'est pas volée
            for(int k = 0; k < 3; k ++){
                if(liste_voitures[k] == null){//Détermination de la cellule du tableau dans laquelle il faut ajouter la référence
                    liste_voitures[k] = voiture_a_ajouter;
                    nbVoitures ++;//On incrémente le nombre de voitures possédées par le propriétaire.
                    voiture_a_ajouter.Proprietaire = this;
                    return true;
                }
            } 
        }
        return false;
    }
}
