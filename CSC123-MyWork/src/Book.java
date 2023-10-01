
public class Book {
		// fields
private static String publishingCompany = "Pearson";
private String ISBN;
private int Pages;
private String author;
private int amazonRank;

// constructor
public Book(String authorName, String ISBN) {
this.author=authorName;
this.ISBN=ISBN;
}

//constructor 2
public Book(String authorName, String ISBN, int Pages) {
super();	
this.author=authorName;
this.ISBN=ISBN;
this.Pages = Pages;
}

//Special constructor
public Book(Book book) {
	this.amazonRank=book.amazonRank;
	this.author=book.author;
	this.ISBN=book.ISBN;
	this.Pages=book.Pages;
}

public static String getPublishingCompany() {
	return publishingCompany;
}

public static void setPublishingCompany(String publishingCompany) {
	Book.publishingCompany = publishingCompany;
}

public String getISBN() {
	return ISBN;
}

public void setISBN(String ISBN) {
	ISBN = ISBN;
}

public int getPages() {
	return Pages;
}

public void setPages(int pages) {
	Pages = pages;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public int getAmazonRank() {
	return amazonRank;
}

public void setAmazonRank(int amazonRank) {
	this.amazonRank = amazonRank;
}

@Override
public String toString() {
	return "Book [Publisher: " + publishingCompany+ ", ISBN: " + ISBN + ", Pages: " + Pages + ", Author: " + author + ", Amazon Rank: " + amazonRank + "]";
}

public boolean equals(Object obj) {
	if(obj==null) return false;
	if(!obj.getClass().getName().equals(this.getClass().getName()));
	Book other=(Book)obj;
	
	if(other.ISBN==this.ISBN && other.author==this.author && other.Pages==this.Pages && other.amazonRank==this.amazonRank) {
		return true;
	}
	else {
		return false;
}
}
}