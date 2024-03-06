//concrete command
public class AirconditionerOn implements Job{

	private Airconditioner airconditioner;
	
	public void setAirconditioner(Airconditioner airconditioner){
		this.airconditioner = airconditioner;
	}
	
	@Override
	public void run() {
		
		if(this.airconditioner!=null){
			System.out.print("On button ");
			this.airconditioner.on();
			this.airconditioner.setTemp(25);
		}
	}

}
