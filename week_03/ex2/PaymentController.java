// the high level module
public class PaymentController {

	private PayHere paymentMethod;
	
	public PaymentController(PayHere paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	public void pay() {
		this.paymentMethod.pay();
	}
}
