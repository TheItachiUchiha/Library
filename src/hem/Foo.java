package hem;

/**
 * Now, you would create a Library Management system using these classes (and more if you feel the need) where you can
 * Add a Student
 * Add a Book
 * A Student can borrow a Book
 * A Student can return a Book
 **/

public class Foo {

	public static void main(String[] args) throws Exception {
		Student student = new Student("hem");
		Book englishBook = new Book("English");
        Book mathBook = new Book("Maths");
		Library library = new Library();
		library.issueBook(student, englishBook);
		library.issueBook(student, mathBook);
		System.out.println("Book borrowed successfully");
		/*library.returnBook(book);
		System.out.println("Book returned successfully");*/
		library.printAllBooksIssued();
	}
}
