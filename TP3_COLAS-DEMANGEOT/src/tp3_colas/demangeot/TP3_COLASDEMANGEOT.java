/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_colas.demangeot;

import armes.*;
import java.util.ArrayList;
import personnages.*;

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
        
        Epée Epée1 = new Epée("Excalibur",8,99);
        Epée Epée2 = new Epée("Durandal",5,50);
        Baton Baton1 = new Baton("Chêne",5, 75);
        Baton Baton2 = new Baton("Charme",6,10);
        
        System.out.println(Epée1);
        System.out.println(Epée2);
        System.out.println(Baton1);
        System.out.println(Baton2);
        
        ArrayList <Arme> TabArme = new ArrayList <>();
        TabArme.add(Epée1);
        TabArme.add(Epée2);
        TabArme.add(Baton1);
        TabArme.add(Baton2);
        
        int tailleTab;
        tailleTab = TabArme.size();
        for (int i = 0; i < tailleTab; i++){
            Arme s;
            s = TabArme.get(i);
            System.out.println(s);
        }
        Magicien Magicien1 = new Magicien("Gandalf",65,true);
        Magicien Magicien2 = new Magicien("Garcimore",44,false);
        Guerrier Guerrier1 = new Guerrier("Conan",78,false);
        Guerrier Guerrier2 = new Guerrier("Lannister",45,true);
        
        System.out.println(Magicien1);
        System.out.println(Magicien2);
        System.out.println(Guerrier1);
        System.out.println(Guerrier2);
        
        ArrayList <Personnage> TabPerso = new ArrayList <>();
        TabPerso.add(Magicien1);
        TabPerso.add(Magicien2);
        TabPerso.add(Guerrier1);
        TabPerso.add(Guerrier2);
        
        int tailleTableau;
        tailleTableau = TabPerso.size();
        for (int i = 0; i < tailleTableau; i++){
            Personnage si;
            si = TabPerso.get(i);
            System.out.println(si);
        }
    }   
}
