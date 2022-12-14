/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cpo_tp_lightoff_courtel_danjou;

/**
 *
 * @author Utilisateur
 */
public class Grille { //Création du tableau 5x5 
    
    CelluleLumineuse[][] PlateauDeJeu = new CelluleLumineuse[5][5]; 
    
    public Grille() { 
        for (int i = 0; i<4; i++){ //ligne 
            for (int j = 0; j<4; j++){ //colonne
                PlateauDeJeu[i][j] = new CelluleLumineuse();

            }
        }
    }
    
    public void afficherGrilleSurConsole() {
        for (int i=4;i>=0;i--){
        System.out.print("\n");
        for (int j=4;j>=0;j--){
            System.out.print(PlateauDeJeu[i][j]); 
        }
    }
    }
}
    
     
