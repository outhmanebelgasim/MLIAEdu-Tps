package Tp7.Ex1;

public class PayPal implements PaymentMethod{
	private String email;
	private double balance;
	
	public PayPal(String email, double balance) {
		this.email = email;
		this.balance = balance;
	}
	
	public boolean pay(double mount) {
		if(mount <= balance) {
			this.balance -= mount;
			System.out.println("PayPal #" + this.email + ", Vous avez paye: " + mount + ", votre solde actuelle: " + this.balance);
			return true;
		}
		System.out.println("Votre solde: " + this.balance + " est insuffisant pour cette operation !");
		return false;
	}
	
	public boolean refund(double mount) {
		if(mount >= 0) {
			this.balance += mount;
			System.out.println("PayPal #" + this.email + ", vous avez rembourse de " + mount + ", votre solde: " + this.balance);
			return true;
		}
		
		System.out.println("Invalide operation! ");
		return false;
	}
	
	public String getName() {
        return "PayPal[" + this.email + "]";
    }
}
