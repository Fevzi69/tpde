/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionde;

/**
 *
 * @author csnd2341
 */
public class Simulateur {

    private int[][] valeurs;
    private De de;
    private int nbJoueurs;
    private int nbLancers;

    public Simulateur() {
        this.valeurs = new int[11][20];
        this.de = new De();
        for (int indJoueur = 0; indJoueur < this.valeurs.length; indJoueur++) {
            for (int indLancer = 0; indLancer < this.valeurs[indJoueur].length; indLancer++) {
                this.valeurs[indJoueur][indLancer] = 0;

            }
        }
    }
    public Simulateur(int nbJ, int nbL) {
        this.valeurs = new int[nbJ][nbL];
        this.de = new De();
        this.nbJoueurs = nbJ;
        this.nbLancers = nbL;
        for (int indJoueur = 0; indJoueur < this.valeurs.length; indJoueur++) {
            for (int indLancer = 0; indLancer < this.valeurs[indJoueur].length; indLancer++) {
                this.valeurs[indJoueur][indLancer] = 0;

            }
        }
    }
    
    public int getNbJoueurs() {
        return nbJoueurs;
    }

    public void setNbJoueurs(int nbJoueurs) {
        this.nbJoueurs = nbJoueurs;
    }

    public int getNbLancers() {
        return nbLancers;
    }

    public void setNbLancers(int nbLancers) {
        this.nbLancers = nbLancers;
    }

    public void afficheLancersJoueur(int numeroJoueur) {
        int[] ligneJoueur = this.valeurs[numeroJoueur];
        for (int cpt = 0; cpt < this.valeurs[numeroJoueur].length; cpt++) {
            System.out.print(this.valeurs[numeroJoueur][cpt] + " ");
        }
    }

    public int totalJoueur(int numeroJoueur) {
        int resultat = 0;
        int[] ligneJoueur = this.valeurs[numeroJoueur];
        for (int cpt = 0; cpt < this.valeurs[numeroJoueur].length; cpt++) {
            resultat = resultat + this.valeurs[numeroJoueur][cpt];
        }
        return resultat;
    }

    public void remplir() {
        for (int indJoueur = 1; indJoueur < this.valeurs.length; indJoueur++) {
            for (int indLancer = 0; indLancer < this.valeurs[indJoueur].length; indLancer++) {
                //on est sur une case
                this.de.lancer();
                this.valeurs[indJoueur][indLancer] = this.de.getValeur();
            }
        }
    }

    public int nombreSix(int numeroJoueur) {
        int resultat = 0;
        int[] ligneJoueur = this.valeurs[numeroJoueur];
        for (int cpt = 0; cpt < this.valeurs[numeroJoueur].length; cpt++) {
            if (this.valeurs[numeroJoueur][cpt] == 6) {
                resultat++;
            }

        }
        return resultat;
    }
    
@Override
        public String toString() {
        String res = "";
        for (int indJoueur = 1; indJoueur < this.valeurs.length; indJoueur++) {
            for (int indLancer = 0; indLancer < this.valeurs[indJoueur].length; indLancer++) {
                res += this.valeurs[indJoueur][indLancer] + " ";
            }
            res += "\n";
        }
        return res;
    }

       
      
}
