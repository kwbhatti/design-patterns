package strategyPattern.rooms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import strategyPattern.decorations.IDecoration;
import strategyPattern.doors.IDoor;
import strategyPattern.floors.IFloor;

public abstract class Room {

	protected IDoor doorType;
	protected IFloor floorType;
	
	protected String colorSelected;
	protected String color;
	protected List<IDecoration> roomDecorations = new ArrayList<IDecoration>();
	
	public Room(IDoor doorType, IFloor floorType) {
		this.doorType = doorType;
		this.floorType = floorType;
	}
	
	public void setColor(String colorSelected) {
		this.colorSelected = colorSelected;
	}
	
	public void addDecorations(IDecoration... roomDecorations) {
		Arrays.asList(roomDecorations).forEach(d -> this.roomDecorations.add(d));
	}
	
	public void paint() {
		this.color = this.colorSelected;
	}
	
	public String getColor() {
		return this.color;
	}
}
