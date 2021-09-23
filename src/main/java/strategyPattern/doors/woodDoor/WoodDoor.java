package strategyPattern.doors.woodDoor;

import strategyPattern.doors.Door;
import strategyPattern.doors.IDoor;

public abstract class WoodDoor extends Door implements IDoor {
	
	public WoodDoor(int numberOfPanels) {
		super(numberOfPanels);
	}
}
