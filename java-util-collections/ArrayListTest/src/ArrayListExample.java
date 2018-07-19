import java.util.ArrayList;
import java.util.List;

import entities.Book;

public class ArrayListExample {

	public static void main(String[] args) {
		// Creating list of Books
		List<Book> list = new ArrayList<Book>();
		
		// Creating Books
		Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
		
		// Adding Books to list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		// Traversing list
		for (Book b : list) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
	}

}