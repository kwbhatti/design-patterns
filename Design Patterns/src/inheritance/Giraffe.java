package inheritance;

public class Giraffe extends Creature {

	private String name;
	private int weight;
	private String sound;
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int getWeight() {
		return weight;
	}

	@Override
	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String getSound() {
		return sound;
	}

	@Override
	public void setSound(String sound) {
		this.sound = sound;
	}

}
