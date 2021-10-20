package commandPattern.one;

public class TVRemote {

	public static ElectronicDevice getDevice() {
		return new Television();
	}
	
	
}
