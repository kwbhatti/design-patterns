package strategyPattern.doors.woodDoor;

import strategyPattern.doors.IDoor;

public class HouseWoodDoor extends WoodDoor implements IDoor {

	public HouseWoodDoor(int numberOfPanels) {
		super(numberOfPanels);
	}
}
