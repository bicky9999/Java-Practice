package methodOverriding;

public class Main {

	public static void main (String [] args) {
		
		// Method overriding = when a subclass provides its own
		//						implementation or a method that is already defined.
		//						Allows for code reusability and give specific implementation.
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		Fish fish = new Fish();
		
		dog.move();
		cat.move();
		fish.move();
	}
}

// here fish class is overridden while dog class and cat class inherits move method from Animal class.
//  overridden fish class now has its own move method.

package methodOverriding;

public class Animal {

	public void move() {
		System.out.println("This animal is moving");
	}
}


package methodOverriding;

public class Cat extends Animal{

}


package methodOverriding;

public class Dog extends Animal{

}


package methodOverriding;

public class Fish extends Animal{
	
	@Override
	public void move() {
		System.out.println("This animal is swimming");
	}

}
