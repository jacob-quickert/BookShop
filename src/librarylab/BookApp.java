/**
 * 
 */
package librarylab;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author jacobquickert
 *
 */
public class BookApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Book> library = new ArrayList<Book>();
		int numBooks = 0;
		
		
		numBooks = Validator.getInt(scan, "How many books would you like to enter? (up to 10 at a time): ", 1, 10);
		
		for (int i = 0; i < numBooks; i++) {
			String iSBN = Validator.getString(scan, "Please enter the book's ISBN (10 characters long): ");
			String author = Validator.getString(scan, "Please enter the author's name (last, first): ");
			String title = Validator.getString(scan, "Please enter the title of the book: ");
			double price = Validator.getDouble(scan, "Please enter the price of the book (to two decimal places): ");
			Book book = new Book (iSBN, author, title, price);
			library.add(book);
			System.out.println("Adding your book to the library." );
			System.out.println();
		}
		
		System.out.println("Here's our library so far...");
		System.out.println();
		int i = 1;
		for (Book b : library) {
			
			System.out.println(i + ". " + b.toString());
			i++;
		}
		
		System.out.println();
		System.out.println("Goodbye. ");

	}

}
