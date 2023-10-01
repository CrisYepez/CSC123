import java.util.Objects;

public class Owner {
	
	String name;
	char gender;
	Dog dog;
	
	public Owner(String name, char gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	
	
	public Dog getDog() {
		return dog;
	}


	public void setDog(Dog dog) {
		this.dog = dog;
		if(dog.getOwner()==null) {
			dog.setOwner(this);
		}
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Owner [name=" + name + ", gender=" + gender + ", dog=" + dog + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(gender, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Owner other = (Owner) obj;
		return gender == other.gender && Objects.equals(name, other.name);
	}

}
