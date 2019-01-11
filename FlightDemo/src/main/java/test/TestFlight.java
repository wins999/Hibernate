package test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import flight.Airline;
import flight.Flight;
import util.HibernateUtil;

public class TestFlight {
	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();	
		
		Flight flight =new Flight();
		flight.setFlightCapacity(5000);
		flight.setFromSector("Mumbai");
		flight.setToSector("Goa");		
		
		List<Airline> airlineslist = new ArrayList<Airline>();
		Airline a1=new Airline();
		a1.setAname("JetAirways");
		Airline a2=new Airline();
		a2.setAname("Gulf");
		Airline a3=new Airline();
		a3.setAname("AirIndia");
		airlineslist.add(a1);
		airlineslist.add(a2);
		airlineslist.add(a3);
		
		flight.setAirlineList(airlineslist);
		
		session.save(flight);
		tx.commit();
		
		System.out.println("Data saved");

		Query query = session.createQuery("from Flight p");
		List<Flight>	c = query.list();	
		for(Flight cust : c)
		{
			System.out.println(cust);
		}   	
		session.close();
			
	
		
		
	}
}
