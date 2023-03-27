package Sensors;

public class SmartMeter {
	public int Energy;

	public SmartMeter() {
		super();
		Energy = (int)(Math.random()*(10000-100+1)+100);;
	}

	public int getEnergy() {
		return Energy;
	}

	public void setEnergy(int energy) {
		Energy = energy;
	}
	

	@Override
	public String toString() {
		return "SmartMeter [Energy=" + Energy + "]";
	}
	
	
	
	


}