package strategyPattern.doors.glassDoor;

import strategyPattern.doors.Door;
import strategyPattern.doors.IDoor;

public abstract class GlassDoor extends Door implements IDoor {

	public GlassDoor(int numberOfPanels) {
		super(numberOfPanels);
	}

}
