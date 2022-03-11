package factorymethodpattern;

public class Main {

	public static void main(String[] args) {
		
		Animal a1 = AnimalFactory.createAnimal(2);
		
		if (a1 != null) {
			System.out.println(a1.description());
		}
		
	}

}
