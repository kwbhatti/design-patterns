package strategyPattern.rooms;

import strategyPattern.doors.IDoor;
import strategyPattern.floors.IFloor;

public class Bedroom extends Room implements IRoom {

	public Bedroom(IDoor doorType, IFloor floorType) {
		super(doorType, floorType);
	}

}
