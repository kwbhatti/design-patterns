package inheritance;

public class Animal {
	
	private String name;
	private int weight;
	private String sound;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		if (weight > 0) {
			this.weight = weight;
		} else {
			System.out.println("weight must be bigger than 0");
		}
	}
	
	public String getSound() {
		return sound;
	}
	
	public void setSound(String sound) {
		this.sound = sound;
	}
	
	private void bePrivate() {
		System.out.println("in a private method");
	}
	
	public void accessPrivate() {
		bePrivate();
	}
}
