package Account;
import Sensors.*;
import Smart.*;

import static Account.UserArray.i;
import static Account.UserArray.users;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class GeneralAdmin extends Account{
	
	public static StreetArray Arr;
	public static SmartStreet street;
	public static SmartBuilding build;
	
	public GeneralAdmin(String username, String password, String email, String name, String phone) {
		super(username, password, email, name, phone);
		// TODO Auto-generated constructor stub
	}
public void CreateResident(String username,String password,String email,String name,String phone,String age,String profession,int sid,int bid,int aid) throws IOException {
	
	for(SmartStreet k:Arr.City) {
		if(sid==k.getID()) 
		for(SmartBuilding m:k.buildings) {
			if(bid==m.getID())
			for(Floor j:m.F) {
				for(Appartment l:j.appart) {
					if(aid==l.getID()) {users.add(i, new Resident(username, password, email, name, phone,age,profession,k,m,l));
					i++;
					fileupdate();
					}
			}
		}
	}}
		
		
	}	
public void CreateAdmin(String username,String password,String email,String name,String phone) throws IOException {
	GeneralAdmin R = new GeneralAdmin(username,password,email,name,phone);
	users.add(UserArray.i, new GeneralAdmin(username, password, email, name, phone));
	i++;
	fileupdate();
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






@Override
public String toString() {
	return "GeneralAdmin [username=" + username +", email=" + email + ", name=" + name
			+ ", phone=" + phone + "]";
}


public String ShowAcc() {
	String out="";
	 for (int i = 0; i < users.size();i++) 
      { 		      
          out =out+users.get(i)+"\n";	
      }   
	 return out;
}
public void DeleteAcc(String userna) throws IOException {
	for(int i=0 ; i<users.size() /* 3 */ ; i++) {
		if(users.get(i).username.equals(userna))  users.remove(users.get(i));
		fileupdate();
	}
	
	
}
		
		
}		