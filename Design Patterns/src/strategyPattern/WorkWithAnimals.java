package strategyPattern;

public class WorkWithAnimals {
	
	public static void main(String[] args) {
		
		Animal sparky = new Dog();
		Animal tweety = new Bird();
		Animal kitty = new Cat();
		System.out.println("dog: "+sparky.tryToFly());
		System.out.println("bird: "+tweety.tryToFly());
		System.out.println("cat: "+kitty.tryToFly());
		sparky.setFlyingAbility(new ItFlys());
		System.out.println("dog: "+sparky.tryToFly());
	}
}
