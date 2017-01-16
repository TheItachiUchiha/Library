package hem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Library {

	List<Book> bookList = new ArrayList<>();
	HashMap<Student, List<Book>> map = new HashMap<>();

	public void addBooks() {
		bookList.add(new Book("English"));
		bookList.add(new Book("Physics"));
	}

	public void issueBook(Student student, Book book) throws Exception {
		if (book.borrowed) {
			throw new Exception("Cannot issue a book which is issued");
		} else {
			book.borrowed();

			List<Book> booksIssuedByStudent = map.get(student);
			if (booksIssuedByStudent == null) {
				booksIssuedByStudent = new ArrayList<Book>();
			}
			booksIssuedByStudent.add(book);
			map.put(student, booksIssuedByStudent);
		}
		
	}

	public void returnBook(Book book) {
		book.borrowed = false;
		
	}

	public boolean exists(Book book) {
		if (bookList.contains(book))
			return true;
		return false;
	}

	public void printAllBooksIssued() {
        System.out.println(">>>>> Printing all issued books <<<<<");
        for (Map.Entry<Student, List<Book>> studentBooksEntry : map.entrySet()) {
            Student student = studentBooksEntry.getKey();
            System.out.println("Student Name: " + student.getStudentName());
            List<Book> books = studentBooksEntry.getValue();
            System.out.print("Book issue: ");
            for (Book book : books) {
                System.out.print(" " + book.getBook() + ", ");
            }
        }
    }

}
