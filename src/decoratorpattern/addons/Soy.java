package decoratorpattern.addons;

import decoratorpattern.AddonDecorator;
import decoratorpattern.Bavarage;

public class Soy extends AddonDecorator {
	
	Bavarage bavarage;
	
	public Soy(Bavarage b) {
		this.bavarage = b;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return bavarage.cost() + 1;
	}

}
