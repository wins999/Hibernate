package DAOImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.lti.model.User1;

import DAO.UserDAO;
import hibernate.util.HibernateUtil;

public class UserDAOImpl implements UserDAO {
	
	
	SessionFactory sf = HibernateUtil.getSessionFactory();
	
	public void registerUser(User1 u1) {
		// TODO Auto-generated method stub
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();		
		
    	session.save(u1);		
    	 
    	tx.commit();
    	session.close();
		
		
		
		
	}

}
