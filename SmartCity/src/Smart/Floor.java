package Smart;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

import Account.Account;

public class Floor {
	public int number;
	public ArrayList<Appartment> appart;
	public int numberAppart=0;
	
	public Floor(int number) {
		
		
		super();
		this.number = number;
		this.appart = new ArrayList<>();
		
		
		//}
		
		
		
	}
	public String Show() {
		String Allapart = " ";
		for(Appartment i: appart) {
			Allapart=Allapart+i.Show()+" \n";
		}
		return "\n Floor("+number+")"+"\n"+Allapart;
	}
	
	public void AddAppartment(boolean BTV,boolean BH,boolean BAC,boolean BWM,boolean BF,boolean BD) throws IOException 
		 {
		//Add Appart
		
		
				appart.add(numberAppart,new Appartment((number*100+(numberAppart+1)),BTV,BH,BAC,BWM,BF,BD));
				
				numberAppart++;
				StreetArray.fileupdate();
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	

	
	public ArrayList<Appartment> getAppart() {
		return appart;
	}

	public void setAppart(ArrayList<Appartment> appart) {
		this.appart = appart;
	}

	public int getNumberAppart() {
		return numberAppart;
	}

	public void setNumberAppart(int numberAppart) {
		this.numberAppart = numberAppart;
	}
	
	@Override
	public String toString() {
		 if(numberAppart>0) return number +" "+ numberAppart+ appart.toString().replaceFirst("]", "").replace(", ", " ").replace("["," ")+ "  ";
		 return number+" " + numberAppart+" ";
	}
	
	
	public String tostring() {
		return "Floor [number=" + number + ", appart=" + appart + ", numberAppart=" + numberAppart + "]";
	}

	public void Ffileupdate() throws IOException {
		File f = new File("APPART.txt");
		FileWriter a = new FileWriter(f);
		a.write(appart.get(1).getID()+" ");
	for(int i=0;i<appart.size()+1;i++ ) {
		
		a.write(appart.get(i).getID()+" ");
		a.write(appart.get(i).getHS()+" ");
		a.write(appart.get(i).getTS()+" ");
		a.write(appart.get(i).getMS()+" ");
		a.write(appart.get(i).getAppliances());
		 a.write("\n");
		}
	a.close();
}
	}
	
	
	

