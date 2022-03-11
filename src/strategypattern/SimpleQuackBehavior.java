package strategypattern;

public class SimpleQuackBehavior implements IQuackBehavior {
	
	public void quack() {
		System.out.println("Quack!!!");
	}
	
}
