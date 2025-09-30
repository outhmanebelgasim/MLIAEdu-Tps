package Tp2;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 3;
        int[][] matrice = new int[n][n];

        System.out.println("Entrez les elements de la matrice 3x3 :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("matrice[" + i + "][" + j + "] = ");
                matrice[i][j] = sc.nextInt();
            }
        }

        if (estMatriceMagique(matrice)) {
            System.out.println("\nLa matrice est magique !");
        } else {
            System.out.println("\nLa matrice n'est pas magique.");
        }

        sc.close();
    }

    public static boolean estMatriceMagique(int[][] matrice) {
        int n = matrice.length;
        int sommeReference = 0;

        for (int j = 0; j < n; j++) {
            sommeReference += matrice[0][j];
        }

        for (int i = 1; i < n; i++) {
            int sommeLigne = 0;
            for (int j = 0; j < n; j++) {
                sommeLigne += matrice[i][j];
            }
            if (sommeLigne != sommeReference) return false;
        }

        for (int j = 0; j < n; j++) {
            int sommeCol = 0;
            for (int i = 0; i < n; i++) {
                sommeCol += matrice[i][j];
            }
            if (sommeCol != sommeReference) return false;
        }

        int sommeDiag1 = 0;
        for (int i = 0; i < n; i++) {
            sommeDiag1 += matrice[i][i];
        }
        if (sommeDiag1 != sommeReference) return false;

        int sommeDiag2 = 0;
        for (int i = 0; i < n; i++) {
            sommeDiag2 += matrice[i][n - i - 1];
        }
        if (sommeDiag2 != sommeReference) return false;

        return true;
    }
}
