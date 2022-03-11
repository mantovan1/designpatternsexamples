package strategypattern;

public class Main {

	public static void main(String[] args) {
		
		IQuackBehavior q = new SimpleQuackBehavior();
		
		Duck d = new Duck(q);
		
		d.quack();

	}

}
