
public class TestDog {

	public static void main(String[] args) {
	Owner owner=new Owner("Camila", 'F');
	Dog dog=new Dog("Snoopy", "Beagle", 4, "White");
	
	owner.setDog(dog);
	dog.setOwner(owner);
	
	System.out.println(owner.getDog());
	

	}

}
