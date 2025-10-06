package Tp7.Ex1;

public class PaymentProcessor {
	private PaymentMethod[] methods;
	private static int count;
	
	public PaymentProcessor() {
		methods = new PaymentMethod[4];
		count = 0;
	}
	
	public void addMethod(PaymentMethod m) {
		if(count == methods.length) {
			PaymentMethod[] tmp = new PaymentMethod[methods.length * 2];
			System.arraycopy(methods, 0, tmp, 0, methods.length);
			methods = tmp;
		}
		methods[count++] = m;
	}
	
	public void processPayment(double mount) {
		System.out.println("Processe paiment: " + mount);
		for(int i = 0; i < count; i++) {
			PaymentMethod m = methods[i];
			System.out.println("Payment via -> " + m.getName());
			boolean paid = m.pay(mount);
			if(paid) {
				m.refund(mount / 2); 
			}
			System.out.println();
		}
	}
}
