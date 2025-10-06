package Tp7.Ex1;

public class Bitcoin implements PaymentMethod {
	private String wallet;
	private double balance;
	
	public Bitcoin(String wallet, double balance) {
		this.wallet = wallet;
		this.balance = balance;
	}
	
	public boolean pay(double mount) {
		if(mount <= balance) {
			this.balance -= mount;
			System.out.println("Wallet #" + this.wallet + ", Vous avez paye: " + mount + ", votre solde actuelle: " + this.balance);
			return true;
		}
		System.out.println("Votre solde: " + this.balance + " est insuffisant pour cette operation !");
		return false;
	}
	
	public boolean refund(double mount) {
		if(mount >= 0) {
			this.balance += mount;
			System.out.println("Wallet #" + this.wallet + ", vous avez rembourse de " + mount + ", votre solde: " + this.balance);
			return true;
		}
		
		System.out.println("Invalide operation! ");
		return false;
	}
	
	public String getName() {
        return "Wallet[" + this.wallet + "]";
    }
}
