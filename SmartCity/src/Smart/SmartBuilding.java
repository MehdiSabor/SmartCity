package Smart;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SmartBuilding {
	public int ID;
	public ArrayList<Floor> F;
	public int numFloor;
	public Type bType;
	public String street;
	public int numResidents;
	
	public SmartBuilding( int id,String bType,String street,int numResident,int numFloor) throws IOException 
	{	
		
		super();
		this.ID = id;
		

		
		this.bType=Type.valueOf(bType);
		
		this.street = street;
		
		
		this.numResidents = numResident;
		
		//Add floor
		
		this.numFloor = numFloor;
		
		this.F = new ArrayList<>();
		for(int i=0;i<numFloor;i++) {
		F.add(i,new Floor(i));
		
		
		}
		
		//this.F = new Floor[numFloor];
		//for(int i =0;i<numFloor;i++) {
		//F[i]=new Floor(i);
		
			
		//}
		//Afileupdate();
		
			}	
		
	public int getID() {
		
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}



	public int getNumFloor() {
		return numFloor;
	}

	public void setNumFloor(int numFloor) {
		this.numFloor = numFloor;
	}

	public String getbType() {
		return bType.toString();
	}

	public void setbType(Type bType) {
		this.bType = bType;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getNumResidents() {
		return numResidents;
	}

	public void setNumResidents(int numResidents) {
		this.numResidents = numResidents;
	}

	@Override
	public String toString() {
		return ID + " "+numFloor+" " + bType
				+ " " + numResidents+ " " + street +" "+ F.toString().replaceFirst("]", "").replace(", ", " ").replace("["," ") ; 
	}
	public int numAppart() {
		int count=0;
		for(Floor i:F) {
			count=count+i.numberAppart;
		}
		return count;
	}
	
	public String Show() {
		return "SmartBuilding [ID=" + ID +  ", numFloor=" + numFloor + ", bType=" + bType +", NumberAppart "+ numAppart()+", numResidents=" + numResidents + "]";
	}

	public void Afileupdate() throws IOException {
		try {
			File f = new File("APPART.txt");
			FileWriter a = new FileWriter(f);
			
				a.write(toString());
			
			
			a.close();
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
			}
	
	

	
}