/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superpuissance4_colas.demangeot.dessors;

/**
 *
 * @author 33781
 */
public class CelluleDeGrille {
    Jeton jetonCourant;
    private boolean avoirTrouNoir;
    private boolean avoirDesintegrateur;
    
    public CelluleDeGrille(){
        jetonCourant = null;
        avoirTrouNoir = false;
        avoirDesintegrateur = false;
    }
    
    public boolean presenceJeton(){
        if (jetonCourant != null){
        return true;
        }else{
        return false;
        }
    }
    
    public Jeton affecterJeton(Jeton nomDuJeton){
        return jetonCourant;
    }
    
    public String lireCouleurDuJeton(){
        if (jetonCourant != null){
            return jetonCourant.toString();
        }else{
            return "vide"; 
        }
    }
    
    public void placerTrouNoir(){
        avoirTrouNoir = true;
    }
    
    public void supprimerTrouNoir(){
        avoirTrouNoir = false;
    }
    
    public boolean presenceTrouNoir(){
        if (avoirTrouNoir == true){
            return true;
        }else{
            return false;
        }
    }
    
    public Jeton recupererJeton(){
        Jeton var;
        var = jetonCourant;
        jetonCourant = null;
        return var;
    }
    
    public void supprimerJeton(){
        jetonCourant = null;
    }
    
    public boolean presenceDesintegrateur(){
        if (avoirDesintegrateur == true){
            return true;
        }else{
            return false;
        }    
    }
    
    public void placerDesintegrateur(){
        avoirDesintegrateur = true;
    }
    
    public void supprimerDesintegrateur(){
        avoirDesintegrateur = false;
    }
    
    public void activerTrouNoir(){
        supprimerJeton();
        supprimerTrouNoir();
    }
    
    @Override
    public String toString() {
        if (presenceJeton() == true){
            return jetonCourant.toString();
        }else if (presenceTrouNoir() == true){
            return "@";
        }else if (presenceDesintegrateur() == true){
            return "D";
        }else{
            return ".";
        }
    }
}
