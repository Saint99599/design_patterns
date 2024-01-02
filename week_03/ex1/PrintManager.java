public class PrintManager implements IManager{

	@Override
	public void salary() {
		System.out.println("Getting the salary...");
	}

	@Override
	public void hire() {
		System.out.println("Getting the hire...");
	}

	@Override
	public void train() {
		System.out.println("Getting the train...");
	}

	@Override
	public void addBonus() {
		System.out.println("Adding bonus at the end of the year...");
	}
}
