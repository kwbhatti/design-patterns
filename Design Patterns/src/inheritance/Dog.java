package inheritance;

public class Dog extends Animal {

	public Dog() {
		super();
		setSound("bark");
	}
	
	public void digHole() {
		System.out.println("Dug a hole");
	}
	
	public void changeVar(int randNum) {
		randNum = 12;
		System.out.println("rand num in method: "+randNum);
	}
}
