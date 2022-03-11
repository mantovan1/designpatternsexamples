package strategypattern;

public class Duck {
	IQuackBehavior q;
	
	public Duck(IQuackBehavior q) {
		this.q = q;
	}
	
	public void quack() {
		q.quack();
	}
}
