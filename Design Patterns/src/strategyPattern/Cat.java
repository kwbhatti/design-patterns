package strategyPattern;

public class Cat extends Animal {

	public Cat() {
		super();
		setSound("meow");
		flyingType = new CantFly();
	}
}
