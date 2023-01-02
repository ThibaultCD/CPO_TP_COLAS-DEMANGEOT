/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightsoff;

import java.util.Scanner;

/**
 *
 * @author 33781
 */
public class LightsOff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CelluleLumineuse jeu = new CelluleLumineuse (5);
        jeu.LumièreDebutDePartie();
        System.out.println(jeu);
        
        Scanner sc = new Scanner (System.in);
        while (true){
        System.out.println("Choisir une coordonnee X de 0 a 5");
        int x = sc.nextInt();
        
        System.out.println("Choisir une coordonnee Y de 0 a 5");
        int y = sc.nextInt();
        
        jeu.choix(x, y);
        System.out.println(jeu);
        }
    }
    
}
