package Tp2;

import java.util.Arrays;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le nombre de lignes : ");
        int rows = sc.nextInt();

        System.out.print("Entrez le nombre de colonnes : ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Entrez les elements de la matrice (0 ou 1) :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("matrix[" + i + "][" + j + "] = ");
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatrice saisie :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int result = maximalRectangle(matrix);
        System.out.println("\nLa plus grande aire de rectangle de 1 est : " + result);

        sc.close();
    }

    public static int maximalRectangle(int[][] matrix) {
        if (matrix.length == 0) return 0;

        int[] left = new int[matrix[0].length];
        int[] right = new int[matrix[0].length];
        Arrays.fill(right, matrix[0].length);
        int[] height = new int[matrix[0].length];

        int maxArea = 0;
        for (int i = 0; i < matrix.length; i++) {
            int curLeft = 0;
            int curRight = matrix[0].length;

            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 1) {
                    height[j]++;
                    left[j] = Math.max(curLeft, left[j]);
                } else {
                    height[j] = 0;
                    left[j] = 0;
                    curLeft = j + 1;
                }
            }

            for (int j = matrix[0].length - 1; j >= 0; j--) {
                if (matrix[i][j] == 1) {
                    right[j] = Math.min(curRight, right[j]);
                } else {
                    right[j] = matrix[0].length;
                    curRight = j;
                }
            }

            for (int j = 0; j < matrix[0].length; j++) {
                maxArea = Math.max(maxArea, (right[j] - left[j]) * height[j]);
            }
        }

        return maxArea;
    }
}
