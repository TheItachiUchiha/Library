package hem;

/**
 * Now, you would create a Library Management system using these classes (and more if you feel the need) where you can
 * add a Student
 * add a Book
 * A Student can borrow a Book
 * A Student can return a Book
 **/

public class Foo {

	public static void main(String[] args) throws Exception {
		Student student = new Student("hem");
		Book book = new Book("English");
		Library library = new Library();
		library.issueBook(student, book);
		System.out.println("Book borrowed successfully");
		library.returnBook(book);
		System.out.println("Book returned successfully");
	}

}
