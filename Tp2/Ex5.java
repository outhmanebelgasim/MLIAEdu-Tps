package Tp2;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez la taille du tableau (n) : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Entrez les éléments du tableau :");
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Entrez le nombre de rotations circulaires: ");
        int k = sc.nextInt();

        System.out.println("\nTableau original :");
        display(arr);

        rotateRight(arr, k);

        System.out.println("\nTableau apres rotation circulaire:");
        display(arr);

        sc.close();
    }

    public static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            start++;
            end--;
        }
    }

    public static void display(int[] arr) {
        for (int val : arr)
            System.out.print(val + " ");
        System.out.println();
    }
}
