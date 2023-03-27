package Sensors;

import java.util.Random;

public class HumiditySensor {
	public int HumidityLevel;

	public HumiditySensor() {
		super();
		HumidityLevel=setHumidityLevel();
	}

	public int getHumidityLevel() {
		return HumidityLevel;
	}

	public int setHumidityLevel() {
		
		return (int)(Math.random()*(99-2+1)+2); 
	}

	@Override
	public String toString() {
		return "[HumidityLevel=" + HumidityLevel + "%]";
	}
	
	
	
	
	
}
