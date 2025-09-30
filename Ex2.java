package Tp2;

import java.util.Scanner;

public class Ex2 {
	
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
        
        if(searchPivot(array) != -1) {
        	System.out.println("Le pivot est : " + searchPivot(array));
        }else {
        	System.out.println("Pas de pivot");
        }
        
    }
	
	
	
	public static int searchPivot(int[] arr) {
		int totalSum = 0;
		int sum = 0;
		
		for(int v : arr) {
			totalSum += v;
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == totalSum - sum*2) {
				return arr[i];
			}
			
			sum += arr[i];
		}
		
		return -1;
	}
}
