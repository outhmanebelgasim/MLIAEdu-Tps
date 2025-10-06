package Tp7.Ex1;

public interface PaymentMethod {
	public boolean pay(double mount);
	public boolean refund(double mount);
	public String getName();
}
