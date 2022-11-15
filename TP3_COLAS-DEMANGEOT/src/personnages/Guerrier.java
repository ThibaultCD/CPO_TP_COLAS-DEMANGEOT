/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

/**
 *
 * @author 33781
 */
public class Guerrier extends Personnage{
   
    boolean cheval;
    
    public Guerrier(String n, int i,boolean c){
        super(n, i);
        cheval = c;
    }
    public void setCheval(boolean cheval) {
        this.cheval = cheval;
    }
    
    @Override
    public String toString(){
        return "Guerrier(Nom = "+ nom + ", NiveauDeVie = " + niveauDeVie + ", A cheval = " + cheval + ")";
    }
}
