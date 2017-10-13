/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionde;

import java.util.Scanner;

/**
 *
 * @author csnd2341
 */
public class Jeu421 {

    private De d1;
    private De d2;
    private De d3;
    private boolean trouve4;
    private boolean trouve2;
    private boolean trouve1;
    int nbCoups;

    public Jeu421() {
        this.d1 = new De();
        this.d2 = new De();
        this.d3 = new De();
        this.trouve4 = false;
        this.trouve2 = false;
        this.trouve1 = false;
        this.nbCoups = 0;
    }

    public De getD1() {
        return d1;
    }

    public void setD1(De d1) {
        this.d1 = d1;
    }

    public De getD2() {
        return d2;
    }

    public void setD2(De d2) {
        this.d2 = d2;
    }

    public De getD3() {
        return d3;
    }

    public void setD3(De d3) {
        this.d3 = d3;
    }

    public boolean isTrouve4() {
        return trouve4;
    }

    public void setTrouve4(boolean trouve4) {
        this.trouve4 = trouve4;
    }

    public boolean isTrouve2() {
        return trouve2;
    }

    public void setTrouve2(boolean trouve2) {
        this.trouve2 = trouve2;
    }

    public boolean isTrouve1() {
        return trouve1;
    }

    public void setTrouve1(boolean trouve1) {
        this.trouve1 = trouve1;
    }

    public int getNbCoups() {
        return nbCoups;
    }

    public void setNbCoups(int nbCoups) {
        this.nbCoups = nbCoups;
    }

    public void jouer() {

        this.d1.lancer();
        this.d2.lancer();
        this.d3.lancer();

        //vérifier la combinaison
        // Cherche si il ya un 4 parmis les valeurs 
        if (d1.getValeur() == 4 || d2.getValeur() == 4 || d3.getValeur() == 4) {
            trouve4 = true;
        }
        if (d1.getValeur() == 2 || d2.getValeur() == 2 || d3.getValeur() == 2) {
            trouve2 = true;
        }
        if (d1.getValeur() == 1 || d2.getValeur() == 1 || d3.getValeur() == 1) {
            trouve1 = true;
        }

        while (!this.trouve4 || !this.trouve2 || !this.trouve1) {
            System.out.println(this);
            Scanner sc = new Scanner(System.in);
            System.out.println("Quel dé on relance ? ");
            int indDe = sc.nextInt();
            System.out.println("ok on relance le dé" + indDe);
            switch (indDe) {
                case 1:
                    this.d1.lancer();
                    break;
                case 2:
                    this.d2.lancer();
                    break;
                case 3:
                    this.d3.lancer();
                    break;
            }

             if (d1.getValeur() == 4 || d2.getValeur() == 4 || d3.getValeur() == 4) {
            trouve4 = true;
        }
        if (d1.getValeur() == 2 || d2.getValeur() == 2 || d3.getValeur() == 2) {
            trouve2 = true;
        }
        if (d1.getValeur() == 1 || d2.getValeur() == 1 || d3.getValeur() == 1) {
            trouve1 = true;
        }
            if (trouve4 == true && trouve2 == true && trouve1 == true) {
                System.out.println("GAGNER");
            }
        }
    }

    @Override
    public String toString() {
        return d1 + "\n" + d2 + "\n" + d3;
    }

}
