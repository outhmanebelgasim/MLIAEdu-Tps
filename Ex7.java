package Tp2;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez la taille du tableau : ");
        int n = sc.nextInt();

        int[] tableau = new int[n];
        System.out.println("Entrez les elements du tableau :");
        for (int i = 0; i < n; i++) {
            System.out.print("tableau[" + i + "] = ");
            tableau[i] = sc.nextInt();
        }

        int majoritaire = trouverMajoritaire(tableau);
        if (majoritaire != -1) {
            System.out.println("\nelements majoritaire est : " + majoritaire);
        } else {
            System.out.println("\nAucun element majoritaire");
        }

        sc.close();
    }

    public static int trouverMajoritaire(int[] tableau) {
        int candidat = tableau[0];
        int compteur = 1;

        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] == candidat) {
                compteur++;
            } else {
                compteur--;
                if (compteur == 0) {
                    candidat = tableau[i];
                    compteur = 1;
                }
            }
        }

        compteur = 0;
        for (int val : tableau) {
            if (val == candidat) compteur++;
        }

        if (compteur > tableau.length / 2) {
            return candidat;
        } else {
            return -1;
        }
    }
}
