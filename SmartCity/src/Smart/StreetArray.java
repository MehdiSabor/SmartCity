package Smart;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Account.GeneralAdmin;
import Account.Resident;

public class StreetArray {
	public static ArrayList<SmartStreet> City;
	public static int i;
	
public StreetArray() throws IOException {
	StreetArray.City=new ArrayList<>();
	getfile_data();
	fileupdate();
	
}

public void AddStreet(String name,int id) throws IOException {
	City.add(i,new SmartStreet(name,id));
	i++;
	fileupdate();
}


 public static void getfile_data() throws IOException {
	
	File a = new File("STREETS.txt");
	Scanner c;
	try {
	
	c = new Scanner(a);
	City= new ArrayList<>(); 
	while (c.hasNext()) {
		int k=0;
	String sName=c.next();
	int sId=c.nextInt();
	double sT=c.nextDouble();
	int sm =c.nextInt();		
	int numbuilding =c.nextInt();
	
	
	
	City.add(k, new SmartStreet(sName,sId));
	City.get(k).setTS(sT);
	City.get(k).setSM(sm);
	City.get(k).setNumBuilding(numbuilding);
	for(int j=0;j<numbuilding;j++) {
		
	
		int Bid =c.nextInt();
		int numFloor =c.nextInt();
		String bType=c.next();
		int numResident =c.nextInt();
		String street=c.next();
		
		City.get(k).buildings.add(j,new SmartBuilding(Bid,bType,street,numResident,numFloor));
			for(int l=0;l<numFloor;l++) {
				
				String Fnumber=c.next();
				
				String FnumAppart =c.next();
				
				City.get(k).buildings.get(j).F.get(l).setNumber(Integer.parseInt(Fnumber));
				City.get(k).buildings.get(j).F.get(l).setNumberAppart(Integer.parseInt(FnumAppart));
				if(Integer.parseInt(FnumAppart)>0) {
				for(int t=0;t<Integer.parseInt(FnumAppart);t++) {
					int Aid=c.nextInt();
					
					
					int Ahum=c.nextInt();
				
					double Atem=c.nextDouble();
					String AM = c.next();
					
					String BTV = c.next();
					String WTV=c.next();
					
					String BH = c.next();
					String WH=c.next();
			
					String BAC = c.next();
					String WAC =c.next();
			
					String BWM = c.next();
					String WWM =c.next();
					
					String BF = c.next();
					String WF = c.next();
					
					String BD = c.next();
					String WD = c.next();
					
					
					City.get(k).buildings.get(j).F.get(l).appart.add(t,new Appartment(Aid,Boolean.parseBoolean(BTV),Boolean.parseBoolean(BH),Boolean.parseBoolean(BAC),Boolean.parseBoolean(BWM),Boolean.parseBoolean(BF),Boolean.parseBoolean(BD)));
					City.get(k).buildings.get(j).F.get(l).appart.get(t).setHS(Ahum);
					City.get(k).buildings.get(j).F.get(l).appart.get(t).setTS(Atem);
					City.get(k).buildings.get(j).F.get(l).appart.get(t).setMS(AM);
					
					City.get(k).buildings.get(j).F.get(l).appart.get(t).Appliances[0].setWorking(Boolean.parseBoolean(WTV));
					City.get(k).buildings.get(j).F.get(l).appart.get(t).Appliances[1].setWorking(Boolean.parseBoolean(WH));
					City.get(k).buildings.get(j).F.get(l).appart.get(t).Appliances[2].setWorking(Boolean.parseBoolean(WAC));
					City.get(k).buildings.get(j).F.get(l).appart.get(t).Appliances[3].setWorking(Boolean.parseBoolean(WWM));
					City.get(k).buildings.get(j).F.get(l).appart.get(t).Appliances[4].setWorking(Boolean.parseBoolean(WF));
					City.get(k).buildings.get(j).F.get(l).appart.get(t).Appliances[5].setWorking(Boolean.parseBoolean(WD));
					
					
					
				}}
	}	
	}
	k++;
	i=k;
	}
	
	c.close();

	} catch (FileNotFoundException e) {
	System.out.println("file not found");
	}
	}
public static void fileupdate() throws IOException {
	try {
		File f = new File("STREETS.txt");
		FileWriter a = new FileWriter(f);
		for(int i=0;i<City.size();i++) {
			a.write(City.get(i).getName()+" ");
			a.write(City.get(i).getID()+" ");
			a.write(City.get(i).getTS()+" ");
			a.write(City.get(i).getSM()+" ");
			a.write(City.get(i).getNumBuilding()+" ");
		
		for(int k = 0; k < City.get(i).getNumBuilding();k++ ) {
			
			a.write(City.get(i).buildings.get(k).toString().replaceFirst("]", "").replace(", ", " ").replace("["," ")+" ");
			a.write("\n");
		}
		
		
		}
		a.close();
		} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();}
		}


}


