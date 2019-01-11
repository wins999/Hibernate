package java.com.dao;

import java.com.model.Book;
import java.util.List;

public interface BookDAO {
	
	
	public  void addBook(Book dep);
	public void updateBook(Book dep,int BookId);
	public void deleteBook(int BookId);
	public  List<Book> allBook();
	public Book allBookById(int BookId);
 
	
 
 
}

    

