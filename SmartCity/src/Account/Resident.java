package Account;

import static Account.UserArray.users;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import Smart.Appartment;
import Smart.SmartBuilding;
import Smart.SmartStreet;

public class Resident extends Account{
	String age;
	String profession;

	public SmartStreet S;
	public SmartBuilding B;
	public Appartment Appart;
	public Resident(String username, String password, String email, String name, String phone, String age, String profession
			,SmartStreet S,SmartBuilding B,Appartment Appart) {
		super(username, password, email, name, phone);
		this.age = age;
		this.profession = profession;
	
		this.Appart =Appart;	
		this.B=B;
		this.S=S;
		
	}
	
	

	




	public int getS() {
		return S.getID();
	}








	public void setS(SmartStreet s) {
		S = s;
	}








	public int getB() {
		return B.getID();
	}








	public void setB(SmartBuilding b) {
		B = b;
	}








	public int getAppartid() {
		return Appart.getID();
	}




	public void setAppartid(Appartment appartid) {
		Appart = appartid;
	}




	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	
	@Override
	public String toString() {
		return "Resident [ " + username +  ", email=" + email + "\n name=" + name
				+ ", " + phone + "," + age + " yo , " + "\n Street=" + S.Name+", StreetID= "+S.ID + ", BuildingID=" + B.ID
				+ ", AppartmentID=" + Appart.ID + "]";
	}








	public Appartment getAppart() {
		return Appart;
	}








	public void setAppart(Appartment appart) {
		Appart = appart;
	}


	public static void fileupdate() throws IOException {
		try {
			File f = new File("ACCOUNTS.txt");
			FileWriter a = new FileWriter(f);
			for(int i=0;i<users.size();i++) {
			if(users.get(i) instanceof GeneralAdmin) {
				a.write("A ");
			}
			else a.write("R ");
			a.write(users.get(i).getUsername()+" ");
			a.write(users.get(i).getPassword()+" ");
			a.write(users.get(i).getEmail()+" ");
			a.write(users.get(i).getName()+" ");
			a.write(users.get(i).getPhone()+" ");
			if(users.get(i) instanceof Resident) {
			a.write(((Resident) users.get(i)).getAge()+" ");
			a.write(((Resident) users.get(i)).getProfession()+" ");
			a.write(((Resident) users.get(i)).getS()+" ");
			a.write(((Resident) users.get(i)).getB()+" ");
			a.write(((Resident) users.get(i)).getAppartid()+" ");
			a.write("\n");
			}
			
			else a.write("\n");
			}
			a.close();
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
			}




	public void setPassword(String password) {
		this.password = password;
		try {
			fileupdate();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String Report(String report) {
	

		return report;
		
	}
	
	
}
