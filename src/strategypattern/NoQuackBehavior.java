package strategypattern;

public class NoQuackBehavior implements IQuackBehavior {
	
	public void quack() {
		System.out.println("...");
	}
	
}
