
public class BookTest {

	public static void main(String[] args) {
		//object created (ref count = 1)
		Book animalFarm=new Book("George Orwell", "1000-1000", 300);
		// (refcount = 2)
		Book animalFarm2=animalFarm;
		
		//(ref count = 1)
		animalFarm2=null;
		//(ref count =0)
		animalFarm2=null;		
	}
}


