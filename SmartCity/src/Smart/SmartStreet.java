package Smart;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import Account.GeneralAdmin;
import Account.Resident;
import Sensors.*;
public class SmartStreet {
	public String Name;
	public int ID;
	public TemperatureSensor TS;
	public SmartMeter SM;
	public  ArrayList<SmartBuilding> buildings;
	public int numBuilding=0;
	public SmartStreet(String name, int iD) {
		super();
		Name = name;
		ID = iD;
		this.TS= new TemperatureSensor();
		this.SM=new SmartMeter();
		
		
		this.buildings = new ArrayList<>();
		
		}
	public void AddBuilding(int id,String bType,String street,int numResident,int numFloor) throws IOException  {
		
		
				buildings.add(numBuilding,new SmartBuilding(id,bType,street,numResident,numFloor));
				this.numBuilding=numBuilding+1;
				StreetArray.fileupdate();
	}
	
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public Double getTS() {
		return TS.getTemperature();
	}
	public void setTS(double tS) {
		TS.Temperature = tS;
	}
	public int getSM() {
		return SM.Energy;
	}
	public void setSM(int sM) {
		SM.Energy = sM;
	}
	public ArrayList<SmartBuilding> getBuildings() {
		return buildings;
	}
	public void setBuildings(ArrayList<SmartBuilding> buildings) {
		this.buildings = buildings;
	}
	public int getNumBuilding() {
		return numBuilding;
	}
	public void setNumBuilding(int numBuilding) {
		this.numBuilding = numBuilding;
	}
	
	@Override
	public String toString() {
		return Name+" " + ID+" "  + TS+" " + SM+" " 
				+ buildings.toString().replaceFirst("]", " ").replace(", ", " ").replace("["," ")+" "  + numBuilding + " ";
	}
	

	public String Show() {
		return "SmartStreet [Name=" + Name + ", ID=" + ID + ", TS=" + TS + ", SM=" + SM +
				", numBuilding=" + numBuilding + "]";
	}
	public void fileupdate() throws IOException {
		try {
			File f = new File("BUILDING.txt");
			FileWriter a = new FileWriter(f);
			for(int i=0;i<buildings.size();i++) {
			
			
			a.write(buildings.get(i).getID()+" ");
			a.write(buildings.get(i).getbType()+" ");
			a.write(buildings.get(i).getStreet()+" ");
			a.write(buildings.get(i).getNumResidents()+" ");
			a.write(buildings.get(i).getNumFloor()+" ");
			
			
			
			
			 a.write("\n");
			}
			a.close();
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
			}
	
	
	
}
