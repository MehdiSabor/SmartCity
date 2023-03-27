package Smart;
import Sensors.*;
import java.util.Arrays;
import java.util.Scanner;

public class Appartment {
		public  Appliance Appliances[];
		public int ID;
		public HumiditySensor HS;
		public TemperatureSensor TS;
		public MotionSensor MS;
		
		public Appartment(int id,boolean BTV,boolean BH,boolean BAC,boolean BWM,boolean BF,boolean BD) {
			
			
			this.ID=id;
			//System.out.println("Fill Appartment"+ID);
			setAppliances(BTV,BH,BAC,BWM,BF,BD);
			this.HS= new HumiditySensor();
			this.TS= new TemperatureSensor();
			this.MS=new MotionSensor();
			
			
		}
		
		public String getAppliances() {
			return this.Appliances[0].isAvailable+" "+
					this.Appliances[0].isWorking+" "+this.Appliances[1].isAvailable+" "+
					this.Appliances[1].isWorking+" "+this.Appliances[2].isAvailable+" "+
					this.Appliances[2].isWorking+" "+this.Appliances[3].isAvailable+" "+
					this.Appliances[3].isWorking+" "+this.Appliances[4].isAvailable+" "+
					this.Appliances[4].isWorking+" "+this.Appliances[5].isAvailable+" "+
					this.Appliances[5].isWorking;
			
		}

		public void setAppliances(Appliance[] appliances) {
			Appliances = appliances;
		}

		public int getID() {
			return ID;
		}

		public void setID(int iD) {
			ID = iD;
		}

		public int getHS() {
			return HS.getHumidityLevel();
		}

		public void setHS(int hS) {
			HS.HumidityLevel = hS;
		}

		public double getTS() {
			return TS.getTemperature();
		}

		public void setTS(double tS) {
			TS.Temperature = tS;
		}

		public boolean getMS() {
			return MS.isMotion();
		}

		public void setMS(String mS) {
			MS.Motion = Boolean.parseBoolean(mS);
		}

		public void setAppliances(boolean BTV,boolean BH,boolean BAC,boolean BWM,boolean BF,boolean BD) {
Appliances = new Appliance[6];
			
			this.Appliances[0]=new Appliance("TV",false,false);
			this.Appliances[1]=new Appliance("Heater",false,false);
			this.Appliances[2]=new Appliance("AC",false,false);
			this.Appliances[3]=new Appliance("WachingMachine",false,false);
			this.Appliances[4]=new Appliance("Fridge",false,false);
			this.Appliances[5]=new Appliance("Dryer",false,false);
			
			

			this.Appliances[0].isAvailable=BTV;

			this.Appliances[1].isAvailable=BH;
			
			this.Appliances[2].isAvailable=BAC;
		
			this.Appliances[3].isAvailable=BWM;

			this.Appliances[4].isAvailable=BF;

			this.Appliances[5].isAvailable=BD;
		}
		
		public void changeAppliances(int i,boolean state) {
			Scanner sc= new Scanner(System.in);
			
			if(this.Appliances[i].isAvailable==true) {
			this.Appliances[i].setWorking(state);}
			else System.out.println("The appliance isn't available");
		}
		

		@Override
		public String toString() {
			return ID+ " "  + HS.HumidityLevel + " " + TS.Temperature
					+ " " + MS.Motion + " "+ Arrays.toString(Appliances).replaceFirst("]", "").replace(", ", " ").replace("["," "); 
		}

		
		public String Show() {
			String app="";
				for(int i=0;i<5;i++) {
					 app=app+Appliances[i].Show();
				}
			return "Appartment ["+ " ID= " + ID + ", " + HS + ", " + TS
					+ ", " + MS +"\n Appliances=" + app  +"]";
		}
		public String ShowI() {
			String app="";
				for(int i=0;i<5;i++) {
					 app=app+Appliances[i].ShowI();
				}
			return "Appartment ["+ " ID= " + ID + ", " + HS + ", " + TS
					+ ", " + MS +"\n Appliances=" + app  +"]";
		}
		
		
		
		
}
