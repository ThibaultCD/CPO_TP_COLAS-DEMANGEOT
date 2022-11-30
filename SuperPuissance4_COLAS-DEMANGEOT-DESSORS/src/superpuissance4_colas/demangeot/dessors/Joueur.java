/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superpuissance4_colas.demangeot.dessors;

import java.util.ArrayList;

/**
 *
 * @author 33781
 */
public class Joueur {
    private String nom;
    private String couleur;
    private ArrayList<Jeton> reserveJetons = new ArrayList<>(0);
    private int nombreDesintegrateur;
    
    public Joueur(String nom){
        this.nom = nom;
        nombreDesintegrateur = 0;
    }
    
    public void affecterCouleur(String couleur){
        if("Rouge".equals(couleur)||"Jaune".equals(couleur)){
            this.couleur = couleur;
        }
    }
    
    public int nombreDeJetons(){
        return reserveJetons.size();
    }
    
    public void ajouterJeton(Jeton jeton){
        reserveJetons.add(jeton);
    }
    
    public Jeton jouerJeton(){
        return reserveJetons.remove(0);
    }
    
    public void obtenirDesintegrateur(){
        nombreDesintegrateur += 1;
    }
    
    public void utiliserDesintegrateur(){
        nombreDesintegrateur -= 1;
    }
    
    
}
