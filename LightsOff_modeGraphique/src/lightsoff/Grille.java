/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightsoff;

/**
 *
 * @author 33781
 */
public class Grille {
    CelluleLumineuse [][] cellules = new CelluleLumineuse [5][5];
    
public Grille(){
        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j < 5; j++) {
                cellules[i][j] = new CelluleLumineuse(false);
            }
        }
    }

 public void DebutPartie(){
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                if (Math.random()>0.5){
                    cellules[i][j].setAllumee();
                }else{
                    cellules[i][j].setEteint();
                }
            }
        }
    }

 public void changerCellule (int i,int j){
            if (i>0){          
                    cellules[i-1][j].changerEtat();
            }if (i<4){
                    cellules[i+1][j].changerEtat();
            }if (j>0){
                    cellules[i][j-1].changerEtat();
            }if (j<4){
                    cellules[i][j+1].changerEtat();

            }
 }
public void changerVoisin (){
        for (int a = 4; a >= 0; a--) {
            for (int b = 0; b < 5; b++) {
                if (cellules[a][b].etreCelluleJouee() == true){
                    changerCellule (a,b);
                    cellules[a][b].setCelluleNonJouee();
                }
            }
        }
    }            

 public boolean partiegagnee(){
        int compteur = 0;
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
                if (cellules[i][j].celluleAllumee() == false){
                    compteur = compteur+1;
                    if (compteur == 25){
                        return true;
                }else{
                    return false;
                    }
                }
            }
        }
        return false;
    }

}
