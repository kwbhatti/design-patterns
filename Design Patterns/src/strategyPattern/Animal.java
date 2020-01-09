package strategyPattern;

public class Animal {
	
	private String name;
	private int weight;
	private String sound;
	private String favFood;
	private double speed;
	
	//using instance variable of the interface instead of implements (composition)
	protected Flys flyingType;
	
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
	
	public String setFavFood() {
		return favFood;
	}
	
	public void setFavFood(String favFood) {
		this.favFood = favFood;
	}
	
	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String tryToFly() {
		return flyingType.fly();
	}
	
	public void setFlyingAbility(Flys flyingType) {
		this.flyingType = flyingType;
	}
	
	
	
}
