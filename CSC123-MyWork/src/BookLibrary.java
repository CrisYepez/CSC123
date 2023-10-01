import java.util.Objects;
import java.util.ArrayList;
public class BookLibrary {
	
	private String title;
	private String author;
	private String ISBN;
	private int Pages;
	Library library;
	
	public BookLibrary(String title, String author, String iSBN, int pages) {
		super();
		this.title = title;
		this.author = author;
		this.ISBN = iSBN;
		this.Pages = pages;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int getPages() {
		return Pages;
	}

	public void setPages(int pages) {
		Pages = pages;
	}

	public Library getLibrary() {
		return library;
	}
	
	public void setLibrary(Library library) {
		this.library = library;
		if(!library.getbookList().contains(this)) {
			library.getbookList().add(this);
	}
}
	
	public Library getlibrary() {
		return this.library;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(ISBN, Pages, author, library, title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookLibrary other = (BookLibrary) obj;
		return Objects.equals(ISBN, other.ISBN) && Pages == other.Pages && Objects.equals(author, other.author)
				&& Objects.equals(library, other.library) && Objects.equals(title, other.title);
	}

	@Override
	public String toString() {
		return "BookLibrary [Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Pages: " + Pages
				+ ", Library: " + library.getName() + "]";
	}

	
	
}
