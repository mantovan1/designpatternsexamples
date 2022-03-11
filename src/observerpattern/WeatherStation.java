package observerpattern;

import java.util.ArrayList;

public class WeatherStation implements ISubject {
	
	ArrayList <IObserver> sensors = new ArrayList <IObserver> ();
	
	public float temperatura = 0f;

	@Override
	public void add(IObserver i) {
		sensors.add(i);
	}

	@Override
	public void remove(IObserver i) {
		sensors.remove(i);
		
	}
	
	@Override
	public void notifyObservers() {
		
		for(IObserver i:sensors) {
			i.update();
		}
	}
	
	public float getTemperatura() {
		return this.temperatura;
	}
	
	public void setTemperatura(float t) {
		this.temperatura = t;
		notifyObservers();
	}

}
