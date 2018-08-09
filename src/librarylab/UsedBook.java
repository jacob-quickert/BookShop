package librarylab;

public class UsedBook extends Book {
	
	private String wear;

	public UsedBook() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsedBook(String iSBN, String author, String title, double price, String wear) {
		super(iSBN, author, title, price);
		this.wear = wear;
		
	}

	/**
	 * @return the wear
	 */
	public String getWear() {
		return wear;
	}

	/**
	 * @param wear the wear to set
	 */
	public void setWear(String wear) {
		this.wear = wear;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format(super.toString() + " Wear: %-5s", wear);
	}
	
	

}
