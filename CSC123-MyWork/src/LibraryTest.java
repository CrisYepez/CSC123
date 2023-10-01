
public class LibraryTest {

	public static void main(String[] args) {
		Library library=new Library("Florence Library", "156 W Florence Ave, 84993, Los Angeles, CA");
		
		BookLibrary book1=new BookLibrary("To kill a mockingbird", "Ben SImmons", "1000-1000", 300);
		BookLibrary book2=new BookLibrary("Cheese", "James Harden", "1000-1001", 400);
		BookLibrary book3=new BookLibrary("Apple tree", "Charles Barkely", "1000-1002", 350);
		
		
		book1.setLibrary(library);
		book2.setLibrary(library);
		book3.setLibrary(library);
	
		System.out.println(library);
	
	}

}
