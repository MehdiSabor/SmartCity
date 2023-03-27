package Smart;

public class Appliance {
	public String Name;
	public boolean isAvailable;
	public boolean isWorking;
	
	public Appliance(String name,boolean isAvailable, boolean isWorking) {
		super();
		this.Name=name;
		this.isAvailable = isAvailable;
		this.isWorking = isWorking;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public boolean isWorking() {
		return isWorking;
	}

	public void setWorking(boolean isWorking) {
		this.isWorking = isWorking;
	}
	public String Show() {
		return "["+Name+" isAvailable: "+isAvailable+"; isWorking: "+isWorking+"] ";
	}
	public String ShowI() {
		return "\n["+Name+" isAvailable: "+isAvailable+"; isWorking: "+isWorking+"] ";
	}
	@Override
	public String toString() {
		return  isAvailable+ " " +isWorking ;
	}

	
}
