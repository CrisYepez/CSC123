import java.util.ArrayList;
import java.util.List;
public class Publication extends Item {

	private String author;
	private String publicationMonth;
	private int numberOfPages;
	public Publication(String name, String vendor, double price, double cost, double weight, double taxRate, String author, String publicationMonth, int numberOfPages) {
		super(name, vendor, price, cost, weight, taxRate);
		this.author =author;
		this.publicationMonth = publicationMonth;
		this.numberOfPages = numberOfPages;
	}
	@Override
	public String toString() {
		return super.toString() + "\n Publication [author: " + author + ", publicationMonth: " + publicationMonth + ", numberOfPages: "
				+ numberOfPages + "]";
	}
}


	
	
	
	
	
	
	

