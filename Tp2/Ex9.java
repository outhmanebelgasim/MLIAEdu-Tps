package Tp2;

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez la taille de la matrice carre (n) : ");
        int n = sc.nextInt();

        int[][] matrice = new int[n][n];

        System.out.println("Entrez les elements de la matrice :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("matrice[" + i + "][" + j + "] = ");
                matrice[i][j] = sc.nextInt();
            }
        }

        calculerDifferenceDiagonale(matrice, n);

        sc.close();
    }

    public static void calculerDifferenceDiagonale(int[][] matrice, int n) {
        int sommePrincipale = 0;
        int sommeSecondaire = 0;

        for (int i = 0; i < n; i++) {
            sommePrincipale += matrice[i][i];          
            sommeSecondaire += matrice[i][n - i - 1];  
        }

        int difference = Math.abs(sommePrincipale - sommeSecondaire);

        System.out.println("Somme diagonale principale : " + sommePrincipale);
        System.out.println("Somme diagonale secondaire : " + sommeSecondaire);
        System.out.println("Valeur absolue de leur différence : " + difference);
    }
}
