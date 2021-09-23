package strategyPattern.rooms;

import strategyPattern.doors.IDoor;
import strategyPattern.floors.IFloor;

public class Bathroom extends Room implements IRoom {

	public Bathroom(IDoor doorType, IFloor floorType) {
		super(doorType, floorType);
	}

}
