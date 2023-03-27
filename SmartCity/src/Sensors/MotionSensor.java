package Sensors;

import java.util.Random;

public class MotionSensor {
	public boolean Motion;

	public MotionSensor() {
		super();
		this.Motion=setMotion();
	}

	public boolean isMotion() {
		return Motion;
	}

	public boolean setMotion() {
		 Random rd = new Random(); 
	      return rd.nextBoolean();
	}

	@Override
	public String toString() {
		String State = (Motion==true)?"Activated":"Desactivated";
		return " [MotionSensor is " + State + "]";
	}
	
	
	
	
}
