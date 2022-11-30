/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superpuissance4_colas.demangeot.dessors;

/**
 *
 * @author 33781
 */
public class PlateauDeJeu {
    CelluleDeGrille[][] grille = new CelluleDeGrille[6][7];
    
    public PlateauDeJeu(){
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 7; j++){
            grille[i][j] = new CelluleDeGrille();
            }
        }
    }
    
    public int ajouterJetonDansColonne(Jeton UnJeton, int colonne){
        for (int i=5; i>=0; i--){
            if ("Rouge".equals(grille[i][colonne].lireCouleurDuJeton()) || "Jaune".equals(grille[i][colonne].lireCouleurDuJeton())){
            grille[i+1][colonne].affecterJeton(UnJeton);
            return i+1;
            }
        }
        return 0;
    }
    
    public boolean grilleRemplie(){
        for (int j=0; j<7; j++){
            if (grille[5][j] == null){
            return false;   
            }
        }
        return true;
    }
    
    public void afficherGrilleSurConsole(){
        for (int i=5; i>=0; i++){
            for (int j=0; j<7; j++){
                if ( j==6 ){
                    System.out.println(grille[i][j] + "\n");
                }else{
                    System.out.println(grille[i][j] + " ");
                }
            }    
        }
    }
    
    public boolean presenceJeton (int x, int y){
        return grille[x][y].presenceJeton() == true;
    }
    
    public String lireCouleurDuJeton(int x, int y){
        return grille[x][y].lireCouleurDuJeton();
    }
    
    public boolean ligneGagnantePourCouleur(String couleur){
        int compteur = 0;
        for (int i=0; i<6; i++){
            for (int j = 0; j<7; j++){
                if (grille[i][j].lireCouleurDuJeton().equals(couleur)){
                    compteur += 1;
                    if (compteur == 4){
                        return true;
                    }
                }else{
                    compteur = 0;
                }
            }
            compteur = 0;
        }
        return false;
    }
    
    public boolean colonneGagnantePourColonne(String couleur){
        int compteur = 0;
        for (int j = 0; j<7; j++){
            for (int i=0; i<6; i++){
                if (grille[i][j].lireCouleurDuJeton().equals(couleur)){
                    compteur += 1;
                    if (compteur == 4){
                        return true;
                    }
                }else{
                    compteur = 0;
                }
            }
            compteur = 0;
        }
        return false;
    }
    
    public boolean diagonaleMontanteGagnantePourColonne(String couleur){
        int compteur = 0;
        for (int i = 0; i<3; i++){
            for (int j=0; j<4; j++){
                for (int k=0; k<7; k++){
                    if (grille[i+k][j+k].lireCouleurDuJeton().equals(couleur)){
                        compteur += 1;
                    }else{
                        compteur = 0;
                    }
                    if (compteur == 4){
                        return true;
                    }
                    if (i==5 && j == 6){
                        break;
                    }
                }
                compteur = 0;
            }
        }
        return false;
    }
    
    public boolean diagonaleDescendanteGagnantePourColonne(String couleur){
        int compteur = 0;
        for (int i = 3; i<6; i++){
            for (int j=0; j<4; j++){
                for (int k=0; k<7; k++){
                    if (grille[i-k][j+k].lireCouleurDuJeton().equals(couleur)){
                        compteur += 1;
                    }else{
                        compteur = 0;
                    }
                    if (compteur == 4){
                        return true;
                    }
                    if (i==0 && j == 6){
                        break;
                    }
                }
                compteur = 0;
            }
        }
        return false;
    }
    
    public void tasserLigne(int y){
        for(int i=0; i<6; i++){
            if(grille[i][y] == null){
                for(int j = i; j<5; j++){
                    grille[j][y] = grille[j+1][y];
                }
                grille[5][y] = null;
            }
        }
    }
    
    public boolean colonneRemplie(int y){
        return grille[5][y] != null;
    }
    
    public boolean placerTrouNoir(int x, int y){
        if (grille[x][y].presenceTrouNoir() == false){
            grille[x][y].placerTrouNoir();
            return true;
        }else{
            return false;
        }
    }
    
    public boolean supprimerTrouNoir(int x, int y){
        if (grille[x][y].presenceTrouNoir() == true){
            grille[x][y].supprimerTrouNoir();
            return true;
        }else{
            return false;
        }
    }
    
    public boolean placerDesintegrateur(int x, int y){
        if (grille[x][y].presenceDesintegrateur() == true){
            grille[x][y].placerDesintegrateur();
            return true;
        }else{
            return false;
        }
    }
    
    public boolean supprimerDesintegrateur(int x, int y){
        if (grille[x][y].presenceDesintegrateur() == true){
            grille[x][y].supprimerDesintegrateur();
            return true;
        }else{
            return false;
        }
    }
    
    public boolean supprimerJeton(int x, int y){
        if (grille[x][y].presenceJeton() == true){
            grille[x][y].supprimerJeton();
            return true;
        }else{
            return false;
        }
    }
    
    public Jeton recupererJeton(int x, int y){
        return grille[x][y].recupererJeton();
    }
}
