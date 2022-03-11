package observerpattern;

public class Main {

	public static void main(String[] args) {
		
		WeatherStation station = new WeatherStation();
		
		Sensor s1 = new Sensor(station);
		Sensor s2 = new Sensor(station);
		Sensor s3 = new Sensor(station);
		
		station.add(s1);
		station.add(s2);
		station.add(s3);
		
		station.setTemperatura(20.5f);

	}

}
