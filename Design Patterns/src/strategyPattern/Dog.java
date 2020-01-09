package strategyPattern;

public class Dog extends Animal {

	public Dog() {
		super();
		setSound("bark");
		flyingType = new CantFly();
	}
	
	public void digHole() {
		System.out.println("Dug a hole");
	}
	
	public void changeVar(int randNum) {
		randNum = 12;
		System.out.println("rand num in method: "+randNum);
	}
}
