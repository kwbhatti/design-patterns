package strategyPattern;

import java.util.ArrayList;
import java.util.List;

import strategyPattern.decorations.BathroomDecoration;
import strategyPattern.decorations.BedroomDecoration;
import strategyPattern.doors.glassDoor.BuildingGlassDoor;
import strategyPattern.doors.woodDoor.HouseWoodDoor;
import strategyPattern.floors.WoodFloor;
import strategyPattern.rooms.Bathroom;
import strategyPattern.rooms.Bedroom;
import strategyPattern.rooms.Room;

public class Test {
	
	public static void main(String[] args) {
		List<Room> myRooms = new ArrayList<Room>();
		
		Room house1Bedroom1 = new Bedroom(new HouseWoodDoor(6), new WoodFloor());
		house1Bedroom1.setColor("off white");
		house1Bedroom1.addDecorations(new BedroomDecoration[] {BedroomDecoration.carpet, BedroomDecoration.wallPainting});
		myRooms.add(house1Bedroom1);
		
		Room house1Bathroom1 = new Bathroom(new HouseWoodDoor(6), new WoodFloor());
		house1Bathroom1.addDecorations(BathroomDecoration.light);
		myRooms.add(house1Bathroom1);

		Room building1Bathroom1 = new Bathroom(new BuildingGlassDoor(), new WoodFloor());
		building1Bathroom1.setColor("white");
		myRooms.add(building1Bathroom1);

		printColors(myRooms);
		paintRooms(myRooms);
		printColors(myRooms);

	}
	
	public static void paintRooms(List<Room> rooms) {
		rooms.forEach(r -> r.paint());
	}
	
	public static void printColors(List<Room> rooms) {
		rooms.forEach(r -> System.out.println(r.getColor()));
	}
}
