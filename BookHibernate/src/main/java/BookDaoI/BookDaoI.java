package BookDaoI;

import java.com.dao.BookDAO;
import java.com.model.Book;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Bid;
import util.HibernateUtil;


public class BookDaoI implements BookDAO{

	//Configuration config = new Configuration();
 //	config.configure("hibernate.cfg.xml");
	SessionFactory sf =  HibernateUtil.getSessionFactory();
	public void addBook(Book book) {
		// TODO Auto-generated method stub
		
 
	 	
	 	Session sess =  sf.openSession();
	 	Transaction tr=sess.beginTransaction();
      
        int id =(Integer) sess.save(book);
        tr.commit();
        sess.close();
      
	}

	public void updateBook(Book book, int BookId) {
		// TODO Auto-generated method stub
        Session session = sf.openSession();	
		
		Transaction tx1 = session.beginTransaction();
		
		Book bid1 = (Book) session.load(Book.class,BookId);
		
		book.setId(BookId);
		bid1 =book;
		session.saveOrUpdate(bid1);
		tx1.commit();
		session.close();
	}

	public void deleteBook(int BookId) {
		// TODO Auto-generated method stub
			Session session = sf.openSession();	
			
			Transaction tx1 = session.beginTransaction();
			
			Bid bid1 = (Bid) session.load(Bid.class,bidId);	
			session.delete(bid1);
			
			tx1.commit();
			session.close();
		
	}

	public List<Book> allBook() {
		// TODO Auto-generated method stub
Session session = sf.openSession();	
		
		Transaction tx = session.beginTransaction();
		
		Query query = session.createQuery("from Bid");
		List<Bid> c1 = query.list();	
		
		return c1;
	}

	public Book allBookById(int BookId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
