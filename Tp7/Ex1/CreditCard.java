package Tp7.Ex1;

public class CreditCard implements PaymentMethod {
	private String number;
	private String holder;
	private double balance;
	
	public CreditCard(String number, String holder, double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
	
	public boolean pay(double mount) {
		if(mount <= balance) {
			this.balance -= mount;
			System.out.println("CreditCard #" + this.number + ", Vous avez paye: " + mount + ", votre solde actuelle: " + this.balance);
			return true;
		}
		System.out.println("Votre solde: " + this.balance + " est insuffisant pour cette operation !");
		return false;
	}
	
	public boolean refund(double mount) {
		if(mount >= 0) {
			this.balance += mount;
			System.out.println("CreditCard #" + this.number + ", vous avez rembourse de " + mount + ", votre solde: " + this.balance);
			return true;
		}
		
		System.out.println("Invalide operation! ");
		return false;
	}
	
	public String getName() {
        return "CreditCard[" + this.holder + "]";
    }
}
