package Sensors;
import Smart.*;
public class MicroController {
	
	
	
	public void changeHumidity(int level,Appartment A) {
		
		A.HS.HumidityLevel = level;	
	}
	
	public void changeTemperature(int level,Appartment A) {
		A.TS.Temperature= level;
	}
	public void MotionSensor(boolean state,Appartment A) {
		A.MS.Motion=state;
	}
	
	
}
