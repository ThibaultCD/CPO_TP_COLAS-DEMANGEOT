/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseur_objet_colas.demangeot;

/**
 *
 * @author 33781
 */
public class TP2_convertisseur_Objet_COLASDEMANGEOT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double resultat = 0;
        
        Convertisseur Convert1 = new Convertisseur();
        while(resultat != resultat-300){
            
            resultat = Convert1.convert();
            System.out.println(Convert1.toString());
            System.out.println("Le résultat de la conversion est " + resultat + "\n");
            
        }
    }
    
}
