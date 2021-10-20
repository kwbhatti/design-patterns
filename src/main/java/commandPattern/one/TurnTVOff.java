package commandPattern.one;

public class TurnTVOff implements Command {

	ElectronicDevice theDevice;
	
	public TurnTVOff(ElectronicDevice newDevice) {
		this.theDevice = newDevice;
	}
	
	@Override
	public void execute() {
		theDevice.off();
	}

	@Override
	public void undo() {
		theDevice.on();
	}	
}
