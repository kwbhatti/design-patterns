package commandPattern.one;

import java.util.List;

public class TurnItAllOff implements Command {

	List<ElectronicDevice> theDevices;
	
	public TurnItAllOff(List<ElectronicDevice> newDevices) {
		this.theDevices = newDevices;
	}
	
	@Override
	public void execute() {
		for(ElectronicDevice electronicDevice: theDevices) {
			electronicDevice.off();
		}
	}

	@Override
	public void undo() {
		for(ElectronicDevice electronicDevice: theDevices) {
			electronicDevice.on();
		}		
	}
}
