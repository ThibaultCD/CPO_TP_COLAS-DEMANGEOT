/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_colas.demangeot;

import armes.*;

/**
 *
 * @author 33781
 */
public class TP3_COLASDEMANGEOT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Epée Epée1 = new Epée("Excalibur",8,100);
        Epée Epée2 = new Epée("Durandal",5,50);
        Baton Baton1 = new Baton("Chêne",5, 75);
        Baton Baton2 = new Baton("Charme",6,10);
        
        System.out.println(Epée1);
        System.out.println(Epée2);
        System.out.println(Baton1);
        System.out.println(Baton2);
    }
    
}
