/**
 * 
 */
package librarylab;

/**
 * @author jacobquickert
 *
 */
public class Book {
	
	private String iSBN;
	private String author;
	private String title;
	private double price;
	
	public Book(){
		iSBN = null;
		author = null;
		title = null;
		price = 0.0;
	}
	
	public Book(String iSBN, String author, String title, double price){
		this.iSBN = iSBN;
		this.author = author;
		this.title = title;
		this.price = price;
	}
	
	public void setISBN(String iSBN) {
		this.iSBN = iSBN;
	}
	
	public String getISBN() {
		return iSBN;
	}
	
	public void setAuthor(String author) {
		this.author=author;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setTitle(String title) {
		this.title= title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setPrice(double price) {
		this.price= price;
	}
	
	public double getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return String.format("ISBN: %-10s Author: %-16s Title: %-21s Price: $ %-6.2f", iSBN, author, title, price);
	}
	
}
