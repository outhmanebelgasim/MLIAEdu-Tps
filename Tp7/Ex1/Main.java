package Tp7.Ex1;

public class Main {
	public static void main(String[] args) {
		PaymentProcessor method = new PaymentProcessor();
		CreditCard c = new CreditCard("123638102-36839", "CDM", 4000);
		PayPal p = new PayPal("belgasimouthmane@gmail.com", 2500);
		Bitcoin b = new Bitcoin("Binance", 5600);
		
		method.addMethod(c);
		method.addMethod(p);
		method.addMethod(p);
		
		double mount = 450;
		method.processPayment(mount);
	}
}
