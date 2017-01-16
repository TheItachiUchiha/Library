package hem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Library {
	private Book book;
	List<Book> bookList = new ArrayList<>();
	HashMap<Student, List<Book>> list = new HashMap<>();
	private Student student;

	public void addBooks() {
		bookList.add(new Book("English"));
		bookList.add(new Book("Physics"));
	}

	public void addInfo() {

		list.put(new Student(student.getStudentName()), list.get(book.getBook()));
	}

	public Book issueBook(Book book) {
		this.book = book;
		if (exists(book) && !book.borrowed) {
			book.borrowed = true;
			return book;
		}

		return null;

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
