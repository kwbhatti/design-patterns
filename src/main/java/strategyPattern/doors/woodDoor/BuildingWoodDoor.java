package strategyPattern.doors.woodDoor;

import strategyPattern.doors.IDoor;

public class BuildingWoodDoor extends WoodDoor implements IDoor {

	public BuildingWoodDoor(int numberOfPanels) {
		super(numberOfPanels);
	}

}
