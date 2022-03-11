package decoratorpattern;

import decoratorpattern.addons.Caramel;
import decoratorpattern.addons.Soy;
import decoratorpattern.options.Decaf;
import decoratorpattern.options.Espresso;

public class Main {

	public static void main(String[] args) {
		
		Decaf decaf = new Decaf();
		
		Soy soy = new Soy(decaf);
		
		System.out.println("Decaf with soy (cost) : " + soy.cost());
		
		Espresso espresso = new Espresso();
		Caramel caramel = new Caramel(espresso);
		
		System.out.println("Espresso with caramel (cost) : " + caramel.cost());

	}

}
