/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package armes;

/**
 *
 * @author 33781
 */
public class Arme {
    String nom;
    protected int attaque;
    
    public Arme(String n, int i){
            nom = n;
            if (i > 0){
                attaque = i;
            }else{
                attaque = 1;
            }
            if (i > 100){
                   attaque = 100;
            }
    }
    public int getAttaque() {
        return attaque;
    }

    public void setAttaque(int attaque) {
        if (attaque > 0){
        this.attaque = attaque;
        }
    }
    @Override
    public String toString(){
        return "Arme(" + "nom=" + nom + ", attaque=" + attaque + ")";
    }
  }
