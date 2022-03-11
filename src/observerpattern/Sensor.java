package observerpattern;

public class Sensor implements IObserver {
	
	WeatherStation station;
	
	public Sensor(WeatherStation s) {
		this.station = s;
	}

	@Override
	public void update() {
		
		System.out.println("Temperature has changed to " + this.station.getTemperatura());
		
	}

}
