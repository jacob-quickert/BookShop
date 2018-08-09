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
public class BookAppPart2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numMenuChoice = 0;

		Book b1 = new Book("f123a456ke", "Smith, Cathy", "You're Fine", 15.95);
		Book b2 = new UsedBook("1234567890", "Quickert, Jamie", "Slay Girl!", 25.05, "Very Good");
		Book b3 = new Book("qwertyuiop", "Radich, Tim", "I Tell You What", 12.95);
		Book b4 = new Book("asdfghjkl;", "Wade, Dan", "Son of a B*^(#!", 19.95);
		Book b5 = new UsedBook("zxcvbnm,./", "Tolkien, J.R.R.", "The Silmarillion", 15.96, "Acceptable");
		Book b6 = new UsedBook("0987654321", "Dumas, Alexander", "Count of Monte Cristo", 9.95, "Good");

		ArrayList<Book> library = new ArrayList<Book>();
		library.add(b1);
		library.add(b2);
		library.add(b3);
		library.add(b4);
		library.add(b5);
		library.add(b6);
		
		System.out.println("Welcome to the Ama-Zone Primal Online Book Store!");
		System.out.println("_________________________________________________");
		
		while (true) {
			// see method below
			printMenu(library);
			System.out.println("_________________________________________________");

			// use Validator to be sure we get the right number
			numMenuChoice = Validator.getInt(scan, "Which book would you like? (Enter a #): ", 1, library.size() + 1);

			if (numMenuChoice == library.size() + 1) {
				break;
			} else { // print arraylist element at index numMenuChoice - 1)
				System.out.println("");
				System.out.println(library.get(numMenuChoice - 1).toString());
				System.out.println("");
			}

			// see method below
			buyTheBook(scan, numMenuChoice, library);
			System.out.println("_________________________________________________");
		}
		System.out.println("");
		System.out.println("I'm pretty sure you should have bought more books. ");
		System.out.println("Whatever. It's your life...");

	}
	// for loop using i to get menu numbers.
	public static void printMenu(ArrayList<Book> menu) {
		int i = 0;
		for (i = 0; i < menu.size(); i++) {
			System.out.println((i + 1) + ". " + menu.get(i).toString());
		}
		System.out.println((i + 1) + ". Quit");
	}

	// offer to let user buy the book
	// give feedback if they do.
	public static void buyTheBook(Scanner sc, int userNum, ArrayList<Book> books) {
		System.out.println("Would you like to buy this book? (y/n) ");
		String choice = sc.nextLine();
		if (choice.equalsIgnoreCase("y")) {
			System.out.println("");
			System.out.println("Oh you read that kind of book? Weird.");
			System.out.println("");
			// remove the book they want to buy from the list
			books.remove(userNum - 1);
		} else {
			System.out.println();
			System.out.println("Please don't waste my time.");
		}
	}

}
