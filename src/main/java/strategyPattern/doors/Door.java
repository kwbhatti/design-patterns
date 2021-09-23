package strategyPattern.doors;

public abstract class Door {

	protected int numberOfPanels;
	
	public Door(int numberOfPanels) {
		this.numberOfPanels = numberOfPanels;
	}
}
