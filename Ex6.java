package Tp2;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez la taille du tableau : ");
        int taille = sc.nextInt();

        int[] tableau = new int[taille];
        System.out.println("Entrez les elements du tableau (entiers positifs ou negatifs) :");
        for (int i = 0; i < taille; i++) {
            System.out.print("tableau[" + i + "] = ");
            tableau[i] = sc.nextInt();
        }

        int somme = sommeSousTableau(tableau);
        System.out.println("\nLa somme maximale d'une sous-suite contigue est : " + somme);

        sc.close();
    }

    public static int sommeSousTableau(int[] tableau) {
        int sommeGlobale = tableau[0];
        int sommeCourante = tableau[0];

        for (int i = 1; i < tableau.length; i++) {
            sommeCourante = Math.max(tableau[i], sommeCourante + tableau[i]);
            sommeGlobale = Math.max(sommeGlobale, sommeCourante);
        }

        return sommeGlobale;
    }
}
