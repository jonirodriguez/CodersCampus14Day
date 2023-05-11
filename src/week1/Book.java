public class Book {

	// Assignment Note: Task 1: Define three private instance variables
	private String title;
	private String author;
	private int publicationYear;
	
	// Assignment Note: Task 2: Create a Constructor that accepts the title, author, and publication year as parameters
	public Book (String title, String author, int publicationYear) {
		
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
		
	}
	
	// Assignment Note: Task 3: Implement getter and setter methods for each instance variable
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title= title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	// Assignment Note: Task 4: Implement toString() method that returns a formatted string with the title, author, and publication year.
	
	@Override
	public String toString() {
		return "A book called " + title + ", written by " + author + ", published back in " + publicationYear + ".";
	}
	
}
