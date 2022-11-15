/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

/**
 *
 * @author 33781
 */
public class Magicien extends Personnage{
   
    boolean confirme;
    
    public Magicien(String n, int i,boolean c){
        super(n, i);
        confirme = c;
    }

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }
    
    @Override
    public String toString(){
        return "Magicien(Nom = "+ nom + ", NiveauDeVie = " + niveauDeVie + ", Confirmé = " + confirme + ")";
    }
}
