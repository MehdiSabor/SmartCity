package Account;

import static Account.UserArray.users;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import Smart.Appartment;
import Smart.Floor;
import Smart.SmartBuilding;
import Smart.SmartStreet;
import Smart.StreetArray;

public class UserArray {

	public static ArrayList<Account> users;
	public static int i=0;
	public static Account Actual;
	
	public static StreetArray Arr;
	public static SmartStreet street;
	public static SmartBuilding build;
	
	public UserArray() throws IOException{
		this.users= new ArrayList<>(); 
		getfile_data();
		
	}
	public boolean login(String username,String password) {
		for(Account i:users) {
			if(i.username.equals(username)&& i.password.equals(password)) {
				Actual=i;
				return true;
				
			}
			
		}
		return false;
		
	}
	static public void getfile_data() throws IOException {
		int i=0;
		File a = new File("ACCOUNTS.txt");
		Scanner c;
		try {
		
		c = new Scanner(a);
		users= new ArrayList<>(); 
		while (c.hasNext()) {
		String Flag=c.next();
		if(Flag.equals("A")) {
		String username=c.next();
		String password=c.next();
		String email=c.next();
		String name=c.next();
		String phone=c.next();
		users.add(i, new GeneralAdmin(username, password, email, name, phone));
		i++;}
		if(Flag.equals("R")) {
			String username=c.next();
			String password=c.next();
			String email=c.next();
			String name=c.next();
			String phone=c.next();
			String age=c.next();
			String profession=c.next();
			
			int sid=c.nextInt();
			int bid=c.nextInt();
			int aid=c.nextInt();
			Arr = new StreetArray();
			for(SmartStreet k:Arr.City) {
				if(sid==k.getID()) 
				for(SmartBuilding m:k.buildings) {
					if(bid==m.getID())
					for(Floor j:m.F) {
						for(Appartment l:j.appart) {
							if(aid==l.getID()) {users.add(i, new Resident(username, password, email, name, phone,age,profession,k,m,l));
							i++;}
					}
				}
			}
				}
			
		}
		}
		c.close();

		} catch (FileNotFoundException e) {
		System.out.println("file not found");
		}
		}
	public Account ReturnObject() {
		return Actual;
	}
	public SmartStreet idtoStreet(int sid,int bid,int aid) {
		SmartStreet str = null;
		SmartBuilding buil = null;
		Appartment app = null;
		for(SmartStreet k:Arr.City) {
			if(sid==k.getID()) str=k;
			for(SmartBuilding m:k.buildings) {
				if(bid==m.getID())buil=m;
				for(Floor j:m.F) {
					for(Appartment l:j.appart) {
						if(aid==l.getID())app=l;
				}
			}
		}
			}
		return str;
	}
	public SmartBuilding idtoBuilding(int sid,int bid,int aid) {
		SmartStreet str = null;
		SmartBuilding buil = null;
		Appartment app = null;
		for(SmartStreet k:Arr.City) {
			if(sid==k.getID()) str=k;
			for(SmartBuilding m:k.buildings) {
				if(bid==m.getID())buil=m;
				for(Floor j:m.F) {
					for(Appartment l:j.appart) {
						if(aid==l.getID())app=l;
				}
			}
		}
			}
		return buil;
	}
	public Appartment idtoAppart(int sid,int bid,int aid) {
		SmartStreet str = null;
		SmartBuilding buil = null;
		Appartment app = null;
		for(SmartStreet k:Arr.City) {
			if(sid==k.getID()) str=k;
			for(SmartBuilding m:k.buildings) {
				if(bid==m.getID())buil=m;
				for(Floor j:m.F) {
					for(Appartment l:j.appart) {
						if(aid==l.getID())app=l;
				}
			}
		}
			}
		return app;
	}

	
	public void DeleteAcc(String userna) throws IOException {
		for(Account i:users) {
			if(i.username.equals(userna)) users.remove(i);
			fileupdate();
		}
		
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
	
	
}
	

