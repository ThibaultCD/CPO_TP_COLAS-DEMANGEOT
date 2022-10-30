/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_colas.demangeot;

/**
 *
 * @author 33781
 */
public class TP2_relation_1_COLASDEMANGEOT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Création de deux objets et de plusieurs références objet
Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
Voiture une488 = new Voiture ("488", "Ferrari", 500 ) ;
Voiture uneUrus = new Voiture ("Urus", "Lamborgini", 400 ) ;
Voiture uneRS3 = new Voiture ("RS3", "Audi", 300 ) ;
Personne Bob = new Personne("Bobby", "Sixkiller");
Personne Reno = new Personne("Reno", "Raines");
System.out.println("liste des voitures disponibles "+ uneClio +"\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;

//Ajout de deux voitures pour Bob et Reno et les affiche
Bob.liste_voitures[0] = uneClio ;
Bob.nbVoitures = 1 ;
uneClio.Proprietaire = Bob ;
System.out.println("la premiere voiture de Bob est " +Bob.liste_voitures[0] ) ;

Bob.liste_voitures[1] = une488;
Bob.nbVoitures ++;
une488.Proprietaire = Bob;
System.out.println("la deuxième voiture de Bob est " +Bob.liste_voitures[1] ) ;
        
Reno.liste_voitures[0] = uneUrus;
Reno.nbVoitures ++;
uneUrus.Proprietaire = Reno;
System.out.println("la premiere voiture de Reno est " +Reno.liste_voitures[0] ) ;
        
Reno.liste_voitures[1] = uneRS3;
Reno.nbVoitures ++;
uneRS3.Proprietaire = Reno;
System.out.println("la deuxième voiture de Reno est " +Reno.liste_voitures[1] ) ;

System.out.println(Bob.toString() + Reno.toString());//Affiche le nombre de voitures de chacunes des personnes
    }
}
