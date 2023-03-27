package Sensors;

public class Stest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HumiditySensor HS = new HumiditySensor();
		TemperatureSensor TS= new TemperatureSensor();
		MotionSensor MS=new MotionSensor();
		System.out.println(HS.toString());
		
		System.out.println(TS.toString());
		System.out.println(MS.toString());
	}

}
