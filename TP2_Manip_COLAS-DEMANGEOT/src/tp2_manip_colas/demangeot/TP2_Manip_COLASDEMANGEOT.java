/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_colas.demangeot;

/**
 *
 * @author 33781
 */
public class TP2_Manip_COLASDEMANGEOT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tartiflette assiette1 = new Tartiflette(500) ;
        Tartiflette assiette2 = new Tartiflette(600) ;
        Tartiflette assiette3 = assiette2 ; 
        
        System.out.println("nb de calories de Assiette 2 : " +assiette2.nbCalories) ;
        System.out.println("nb de calories de Assiette 3 : " +assiette3.nbCalories) ;
// On a assiette2 et assiette3 qui referencent la même tartiflette 
        
        Tartiflette var = assiette1;
        assiette1 = assiette2;
        assiette2 = var;
// Les deux lignes sont fausses. Si une reference objet annonce referencer un type objet, elle ne peut pas en referencer une autre qui n'a pas de rapport.
  
        Moussaka[] TabMoussaka = new Moussaka[10];
        for (int i = 0; i < TabMoussaka.length; i++){
            TabMoussaka[i] = new Moussaka(1);       //on met dans une liste de type moussaka 10 instances de la classe Moussaka
        }
    }   
}
