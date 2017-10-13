/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionde;

import view.JeuDe;

/**
 *
 * @author csnd2341
 */
public class GestionDe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Simulateur sim = new Simulateur(15, 15);
       
//       Jeu421 jeu = new Jeu421();
//       jeu.jouer();
//        System.out.println(jeu);
       //System.out.println("Après construction");
       //System.out.println(sim);
//       sim.remplir();
//       System.out.println("Après remplissage");
//       System.out.println(sim);
//       
//       sim.afficheLancersJoueur(5);
//       System.out.println("");
//       System.out.println("Total joueur 5 : " + sim.totalJoueur(5));
//       System.out.println("Nombre de 6 : " + sim.nombreSix(5));
             JeuDe j421 = new JeuDe();
             j421.setVisible(true);
    }

}