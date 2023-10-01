package lab_2_CSC123;

public class Dog {

	private String breed;
	private String color;
	private double weight;
	private double height;
	private String fur;
	
	public Dog(String breed, String color, double weight, double height, String fur) {
		this.breed = breed;
		this.color = color;
		this.weight = weight;
		this.height = height;
		this.fur = fur;
	}
	
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getFur() {
		return fur;
	}
	public void setFur(String fur) {
		this.fur = fur;
	}
}
