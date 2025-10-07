package Tp8.Ex1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Entrez le 1er nombre: ");
			double a = sc.nextDouble();
			
			System.out.println("Entrez le 2eme nombre: ");
			double b = sc.nextDouble();
			
			System.out.println("La somme est: " + calc.add(a, b));
			System.out.println("La substraction est: " + calc.sub(a, b));
			System.out.println("La multiplication est: " + calc.mul(a, b));
			System.out.println("La division est: " + calc.division(a, b));
		}catch(ArithmeticException e) {
			System.err.println(e.getMessage());
		}finally {
			
		}
	}
}
