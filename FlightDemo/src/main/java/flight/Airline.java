package flight;

public class Airline {
	
	private int airlineid;
	private String aname;
	
	public Airline() {
		super();
	}
	
	public Airline(int airlineid, String aname) {
		super();
		this.airlineid = airlineid;
		this.aname = aname;
	}

	
	public int getAirlineid() {
		return airlineid;
	}

	public void setAirlineid(int airlineid) {
		this.airlineid = airlineid;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	@Override
	public String toString() {
		return "Airline [airlineid=" + airlineid + ", aname=" + aname + "]";
	}	

}
