package Sensors;

import java.util.Random;

public class TemperatureSensor {
	public double Temperature;

	public TemperatureSensor() {
		super();
		Temperature=setTemperature();
	}

	

	public double getTemperature() {
		return Temperature;
	}

	public double setTemperature() {
		Random r = new Random();
		return 5 + (45 - 5) * r.nextDouble();
	}
	
	@Override
	public String toString() {
		return "[Temperature=" + String.format("%.2f", Temperature) + "°C]";
	}
	
	
	
}
