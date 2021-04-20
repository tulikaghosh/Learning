package examples.pubhub.dao;

import java.util.List;

import examples.pubhub.model.Book;
//import examples.pubhub.model.Book;
import examples.pubhub.model.Tag;

public class TestDAO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	BookDAO dao = new BookDAOImpl();
	    List<Book> list = dao.getAllBooks();

	    for (int i = 0; i < list.size(); i++){
	      Book t = list.get(i);
	      System.out.println(t);
	    }*/
		
		 TagDAO dao = new TagDAOImpl();
		   List<Tag> list = dao.getAllTagsForBook("1111111111111");

		    for (int i = 0; i < list.size(); i++){
		      Tag t = list.get(i);
		      System.out.println(t);
		 
		    }
		 
		    }
}
	   
	

