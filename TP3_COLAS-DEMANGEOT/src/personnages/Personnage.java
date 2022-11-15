/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

import armes.Arme;
import java.util.ArrayList;

/**
 *
 * @author 33781
 */
public class Personnage {
    
    String nom;
    protected int niveauDeVie;
    Arme Arme_en_Main = null;
    ArrayList<Arme> Tab = new ArrayList<>(5);
    
    public Personnage(String n, int i){
            nom = n;
            niveauDeVie = i;
    }
    public int getniveauDeVie() {
        return niveauDeVie;
    }
    public void setniveauDeVie(int niveauDeVie) {
        this.niveauDeVie = niveauDeVie;
    }
    @Override
    public String toString(){
        return "Personnage(" + "nom=" + nom + ", Niveau de vie =" + niveauDeVie + ")";
    }
    public Arme getArme_en_Main(){
        return Arme_en_Main;
    }
    public void AjoutArme(Arme a){
        if (Tab.size() < 5){
            Tab.add(a);
        }
    }
    public void MethodeArme(Arme a){
        int verif = 0;
        for (int i = 0; i < Tab.size(); i++){
            if (Tab.get(i) == a){
                System.out.println("L'arme a bien été trouvée et affectée.");
                Arme_en_Main = Tab.get(i);
                verif = 1;
                break;
            }
        }
        if (verif == 0){
            System.out.println("L'arme n'a pas été tourvée.");
        }
    }
}
