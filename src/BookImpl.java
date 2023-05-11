import java.util.List;
import java.util.ArrayList;

public class BookImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Assignment Note: Task 5: Add >= three books to the ArrayList...
		
		List<Book>bookList = new ArrayList<>();
		
		Book book1 = new Book("The Time Machine", "H.G. Wells", 1870);
		Book book2 = new Book("Geek Love", "Katherine Dunn", 1997);
		Book book3 = new Book("I am the Cheese", "Robert Cormier", 1979);
		
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		
		// ...and print the details of each book using the toString() method.
		
		for(Book book : bookList)
		System.out.println(book.toString());
		
	  }
}
