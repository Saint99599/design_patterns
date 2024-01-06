// low level module
public class PayPal implements PayHere{

	@Override
	public void pay() {
		System.out.println("Paying with PayPal...");
	}
}
