package hem;

/*
Now, you would create a Library Management system using these classes (and more if you feel the need) where you can 

* add a Student 
* add a Book 
* A Student can borrow a Book 
* A Student can return a Book*/

public class Foo {
	private Book book;

	public static void main(String[] args) {
		Student student = new Student("hem");
		Book book = new Book("English");
		Library library = new Library();
		System.out.println(library.issueBook(book));
		System.out.println(library.returnBook(book));

	}

}
