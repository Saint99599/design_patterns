public class App {

	public static void main(String[] args) {
		
		PaymentController controller = new PaymentController(new AliPay());
		controller.pay();		
	}
}
