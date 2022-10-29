/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_colas.demangeot;

/**
 *
 * @author 33781
 */
public class Voiture {
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne Proprietaire;
    
    public Voiture(String modele, String marque, int puissanceCV){
        Modele = modele;
        Marque = marque;
        PuissanceCV = puissanceCV;
        Proprietaire = null;  
}
    @Override
    public String toString(){
        return "/Marque : " + Marque + " /Modele : " + Modele + " /Puissance : " + PuissanceCV + " /Proprietaire : " + Proprietaire;
    }
}
