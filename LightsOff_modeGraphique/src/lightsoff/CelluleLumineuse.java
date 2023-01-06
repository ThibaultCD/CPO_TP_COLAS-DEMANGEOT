/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightsoff;
/**
 *
 * @author 33781
 */
public class CelluleLumineuse {
    boolean etreAllumee;
    boolean celluleJouee;
    
    public CelluleLumineuse(boolean etreallumee){
        etreAllumee = etreallumee;
    }
    
    public boolean celluleAllumee() {
        if (etreAllumee == true){
            return true;
        }else{
            return false;
        }
    }
    
    public void setAllumee(){
        etreAllumee = true;
    }
    
    public void setEteint(){
        etreAllumee=false;
    }
    
    public boolean changerEtat(){
        if (etreAllumee == true){
            etreAllumee = false;
        }else{
            etreAllumee = true;
        }
    return true;  
    }
    
    public boolean etreCelluleJouee (){
        if (celluleJouee == true){
            return true;
        }return false;
    }

    /**fait que la cellule vient d'etre joué
     *
     */
    public void setCelluleJouee(){
       celluleJouee = true;
   }

    /**
     *fait que la cellule ne vient pas d'etre jouée
     */
    public void setCelluleNonJouee(){
       celluleJouee = false;
   }
}       