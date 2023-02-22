package concorrency;

public class Counter {
	private int i;
	
	synchronized public void inrement() {
		i++;
	}

	public int getI() {
		return i;
	}
	
	
}
