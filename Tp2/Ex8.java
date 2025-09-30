package Tp2;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez la taille du tableau (n) : ");
        int n = sc.nextInt();

        int[] tableau = new int[n];
        System.out.println("Entrez les elements du tableau (entre 1 et n) :");
        for (int i = 0; i < n; i++) {
            tableau[i] = sc.nextInt();
        }

        trouverNombresAbsents(tableau, n);

        sc.close();
    }

    public static void trouverNombresAbsents(int[] tableau, int n) {
        for (int i = 0; i < n; i++) {
            int val = Math.abs(tableau[i]); 
            if (val >= 1 && val <= n) {
                tableau[val - 1] = -Math.abs(tableau[val - 1]);
            }
        }

        System.out.print("elements manquants : ");
        for (int i = 0; i < n; i++) {
            if (tableau[i] > 0) {
                System.out.print((i + 1) + " ");
            }
        }
        System.out.println();
    }
}
