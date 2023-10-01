import java.util.Objects;
import java.util.ArrayList;
public class Library {

	private String name;
	private String address;
	BookLibrary book;
	private ArrayList<BookLibrary> bookList=new ArrayList<BookLibrary>();
	
	public Library(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public BookLibrary getBook() {
		return book;
	}

	public void addBook(BookLibrary book) {
		this.bookList.add(book);
		if(book.getLibrary()==null) {
			book.setLibrary(this);
		}
	}
	public ArrayList<BookLibrary> getbookList() {
		return this.bookList;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, book, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Library other = (Library) obj;
		return Objects.equals(address, other.address) && Objects.equals(book, other.book)
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Library [Name: " + name + ", Address: " + address + ", Number of Books: " + bookList.size() + "]";
	}
}
