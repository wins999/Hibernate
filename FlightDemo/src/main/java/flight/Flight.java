package flight;

import java.util.List;

public class Flight {	
	
	private int flightid;
	private String fromSector;
	private String toSector;
	private int flightCapacity;	
	private List <Airline> airlineList;

	public Flight() {
		super();
	}
	
	public Flight(int flightid, String fromSector, String toSector, int flightCapacity) {
		super();
		this.flightid = flightid;
		this.fromSector = fromSector;
		this.toSector = toSector;
		this.flightCapacity = flightCapacity;
	}	

	public int getFlightid() {
		return flightid;
	}

	public void setFlightid(int flightid) {
		this.flightid = flightid;
	}

	public String getFromSector() {
		return fromSector;
	}

	public void setFromSector(String fromSector) {
		this.fromSector = fromSector;
	}

	public String getToSector() {
		return toSector;
	}

	public void setToSector(String toSector) {
		this.toSector = toSector;
	}

	public int getFlightCapacity() {
		return flightCapacity;
	}

	public void setFlightCapacity(int flightCapacity) {
		this.flightCapacity = flightCapacity;
	}

	public List<Airline> getAirlineList() {
		return airlineList;
	}

	public void setAirlineList(List<Airline> airlineList) {
		this.airlineList = airlineList;
	}
	
	@Override
	public String toString() {
		return "Flight [flightid=" + flightid + ", fromSector=" + fromSector + ", toSector=" + toSector
				+ ", flightCapacity=" + flightCapacity + ", airlineList=" + airlineList + "]";
	}

	
	
	
}
