package factorymethodpattern;

public class AnimalFactory {
	
	public static Animal createAnimal(int i) {
		switch(i) {
			case 1:
				return new Dog();
			case 2:
				return new Cat();
			case 3: 
				return new Duck();
			default:
				return null;
		}
	}

}
