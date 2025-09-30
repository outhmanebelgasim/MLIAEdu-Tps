package Tp2;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer le nombre de lignes: ");
		int l = sc.nextInt();
		System.out.println("Entrer le nombre de colomnes: ");
		int c = sc.nextInt();
		
		int[][] array = new int[l][c];
		for(int i = 0; i < l; i++) {
			for(int j = 0; j < c; j++) {
				System.out.printf("array[%d][%d] = \n", i, j);
				array[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Les elements sont: ");
		for(int i = 0; i < l; i++) {
			for(int j = 0; j < c; j++) {
				System.out.printf("array[%d][%d] = %d\n", i, j, array[i][j]);
			}
		}
	}
}
