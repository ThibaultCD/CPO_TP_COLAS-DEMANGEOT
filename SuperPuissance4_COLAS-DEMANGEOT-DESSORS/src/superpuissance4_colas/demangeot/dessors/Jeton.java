/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superpuissance4_colas.demangeot.dessors;

/**
 *
 * @author 33781
 */
public class Jeton {
    private String Couleur;

    public Jeton(String couleur) {
        Couleur = couleur;
    }

    public String lireCouleur() {
        return Couleur;
    }

    @Override
    public String toString() {
        String c;
    
        if ("Rouge".equals(Couleur)) {
            c = "R";
        } else {
            c = "J";
        }
        return c;
    }
}
