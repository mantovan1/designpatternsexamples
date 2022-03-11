package decoratorpattern.addons;

import decoratorpattern.AddonDecorator;
import decoratorpattern.Bavarage;

public class Caramel extends AddonDecorator {
	
	Bavarage bavarage;
	
	public Caramel(Bavarage b) {
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
		return this.bavarage.cost() + 2;
	}

}
