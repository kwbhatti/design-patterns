package inheritance;

public class Monkey implements Living {

	private String name;
	private double height;
	private double weight;
	private String favFood;
	private double speed;
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
	public double getHeight() {
		return height;
	}
	@Override
	public void setHeight(double height) {
		this.height = height;
	}
	@Override
	public double getWeight() {
		return weight;
	}
	@Override
	public void setWeight(double weight) {
		this.weight = weight;
	}
	@Override
	public String setFavFood() {
		return favFood;
	}
	@Override
	public void setFavFood(String favFood) {
		this.favFood = favFood;
	}
	@Override
	public double getSpeed() {
		return speed;
	}
	@Override
	public void setSpeed(double speed) {
		this.speed = speed;
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
