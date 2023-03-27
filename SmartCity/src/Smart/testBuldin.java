package Smart;

import java.io.IOException;

public class testBuldin {
	public static StreetArray Arr;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Appartment F1= new Appartment(1);
		//System.out.println(F1.toString());
		
		//Floor F1 = new Floor(1);
		//System.out.println(F1.toString());
		
		/*F1.changeAppliances();
		System.out.println(F1.toString());
	}*/
		
		Arr =new StreetArray();
		System.out.println("d");
		int i=0;
		
		Arr.AddStreet("central", 76);
		
		StreetArray.City.get(i).AddBuilding(4,"BUSINESS",StreetArray.City.get(i).Name,1,3);
		StreetArray.City.get(1).AddBuilding(4,"BUSINESS",StreetArray.City.get(i).Name,1,3);
		
		StreetArray.City.get(i).buildings.get(i).F.get(0).AddAppartment(true,true,false,false,true,true);
		//S1.buildings.get(i).F.get(0).Ffileupdate();
		//S1.buildings.get(i).Afileupdate();
		
		StreetArray.fileupdate();
		
		System.out.println(StreetArray.City.get(0).toString());
		System.out.println(StreetArray.City.get(1).toString());
System.out.println(Arr);
}
	}
