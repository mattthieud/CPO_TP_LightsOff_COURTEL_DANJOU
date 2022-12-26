/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cpo_tp_lightoff_courtel_danjou;

import java.util.Scanner;

/**
 *
 * @author Utilisateur
 */
public class CPO_TP_LIGHTOFF_COURTEL_DANJOU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Joueur J = new Joueur("jul");
        Partie game = new Partie(J);
        
        game.placerCelluleLumineuse();
        game.LancerPartie();
        
        while(game.grille_jeu.Grilleteinte()) {
            
        System.out.print("\n");
        System.out.println("Quel est ton x ? (vertical du haut 4 vers le bas 0)");
        int x = sc.nextInt();
        System.out.println("Quel est ton y ? (horizontal de droite 4 a gauche 0)");
        int y = sc.nextInt();
        
        try {
             game.action(x, y);
        } catch (ArrayIndexOutOfBoundsException erreur) {
            System.out.println("erreur, essaye encore!");
        }
       
        game.LancerPartie();
        }
        
        System.out.println("Félicitation, vous avez remporté la partie de LigthOff !!");
    }
}

