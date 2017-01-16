package hem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class Library {

	List<Book> bookList = new ArrayList<>();
	HashMap<Student, List<Book>> map = new HashMap<>();

	public void addBooks() {
		bookList.add(new Book("English"));
		bookList.add(new Book("Physics"));
	}

	public Book issueBook(Student student, Book book) throws Exception {
		if (book.borrowed) {

			throw new Exception("Cannot issue a book which is issued");

		} else {
			book.borrowed(true);
			List<Book> booksIssuedByStudent = map.get(student);
			if (booksIssuedByStudent == null) {
				booksIssuedByStudent = new ArrayList<Book>();
			}
			booksIssuedByStudent.add(book);
			map.put(student, booksIssuedByStudent);
		}
		return book;
	}

	public Book returnBook(Book book) {
		book.borrowed = false;
		return book;
	}

	public boolean exists(Book book) {
		if (bookList.contains(book))
			return true;
		return false;

	}

}
