package strategyPattern.doors.glassDoor;

import strategyPattern.doors.IDoor;

public class HouseGlassDoor extends GlassDoor implements IDoor {

	public HouseGlassDoor(int numberOfPanels) {
		super(numberOfPanels);
	}

}
