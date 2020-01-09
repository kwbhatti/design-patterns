package inheritance;

public class WorkWithAnimals {
	
	int justNum = 10;
	
	public static void main(String[] args) {
		
		//classes and inheritance
		Dog fido = new Dog();
		fido.setName("fido");
		System.out.println(fido.getName());
		fido.digHole();
		fido.setWeight(-1);
		
		int randNum = 10;
		fido.changeVar(randNum);
		System.out.println("rand num after method: "+randNum);
		
		changeObjectName(fido);
		System.out.println("dog name after method: "+fido.getName());
		
		//inheritance 
		Animal doggy = new Dog();
		Animal kitty = new Cat();
		System.out.println("doggy says: "+doggy.getSound());
		System.out.println("kitty says: "+kitty.getSound());
		
		Animal[] animals = new Animal[2];
		animals[0] = doggy;
		animals[1] = kitty;
		System.out.println("doggy says: "+animals[0].getSound());
		System.out.println("kitty says: "+animals[1].getSound());
		
		speakAnimal(doggy);
		speakAnimal(kitty);
		((Dog)doggy).digHole();
		
		//cant call non static justNum or a non static method in this static method 
		//without a refrence to the object of the class
		
		fido.accessPrivate();
		
		Giraffe frank = new Giraffe();
		frank.setName("frank");
		System.out.println(frank.getName());
		
	}
	
	public static void changeObjectName(Dog fido) {
		fido.setName("Marcus");
	}
	
	public static void speakAnimal(Animal randAnimal) {
		System.out.println("Animal says: "+randAnimal.getSound());
	}	
}
