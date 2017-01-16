package hem;



public class Book {

	private String bookName;
	public boolean borrowed;
	

	public Book(String bookName) {
		this.bookName = bookName;
	}
	public String getBook() {
		return bookName;
	}
	
	public void borrowed() {
		borrowed = true;
	}
	
	public void bookReturned() {
		borrowed = false;
	}
	
	public boolean isBorrowed() {
		return borrowed;
	}

}
