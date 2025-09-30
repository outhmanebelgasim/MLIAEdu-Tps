package Tp2;

import java.util.Scanner;

public class Ex1 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Entrer n: "); 
	        int n = sc.nextInt();
	        
	        int[] array = new int[n];
	        
	        for(int i = 0; i < n; i++) {
	            System.out.printf("array[%d] = ", i); 
	            array[i] = sc.nextInt();
	        }
	        
	        System.out.print("Array: ");
	        for(int i = 0; i < n; i++) {
	            System.out.printf("%d ", array[i]);
	        }
	        System.out.printf("\n");
	        
	        System.out.println("La longueur de la plus longue sous-suite strictement croissante est: ");
	        lengthDescending(array); 
	    }
	
	public static void lengthDescending(int[] arr) {
		int maxLength = 1;
		for(int i = 0; i < arr.length; i++) {
			int len = 1;
			int previousElement = arr[i];
			
			for(int j = i + 1; j < arr.length; j++) { // boucle se commence au deuxieme element du tableau
				if(arr[j] > previousElement) { // ici la condition de la sous-suite 
					len++;
					previousElement = arr[j];
				}
			}
			
			if(len > maxLength) maxLength = len;
		}
		
		System.out.println(maxLength);
	}
}
