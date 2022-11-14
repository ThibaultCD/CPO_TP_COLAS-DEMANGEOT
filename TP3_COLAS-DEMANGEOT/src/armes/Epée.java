/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package armes;

/**
 *
 * @author 33781
 */
public class Epée extends Arme {
    
    int finesse;
    
    public Epée(String n, int i, int a){
        super(n, i);
        if (a > 0){
            finesse = a;
        }else{
            finesse = 0;  
        }
    }
    @Override
    public String toString(){
        return "Epée(nom = " + nom + ", attaque = " + attaque + ", finesse = " + finesse + ")";
    }
    
}
