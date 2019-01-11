package com.lti.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.lti.model.User1;

import DAOImpl.UserDAOImpl;
import hibernate.util.HibernateUtil;

/**
 * Servlet implementation class InsertServlet
 */
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public InsertServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UserDAOImpl ui=new UserDAOImpl();
		SessionFactory sf = HibernateUtil.getSessionFactory();
	//	Session session = sf.openSession();
	//	Transaction tx = session.beginTransaction();		
		
		String fname1 =request.getParameter("first");
		String lname1 = request.getParameter("last");
		
		
		 User1 u1=new User1();
		 
		 u1.setFname(fname1);
		 u1.setLname(lname1);
		 
		 ui.registerUser(u1);
		
	  //  session.save(u1);		
	
		//System.out.println("User Successfully added with UserId : "+id);
		
	//	tx.commit();
	//	session.close();
		
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
