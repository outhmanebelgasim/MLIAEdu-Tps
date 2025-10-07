package Tp8.Ex1;

public class Calculator {
	public double add(double a, double b) {
		return a + b;
	}
	
	public double sub(double a, double b) {
		return a - b;
	}
	
	public double division(double a, double b) {
		if(b == 0) {
			throw new ArithmeticException("Division par 0 est impossible !");
		}
		
		return a / b;
	}
	
	public double mul(double a, double b) {
		return a * b;
	}
}
