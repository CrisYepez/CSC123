package lab_2_CSC123;

public class Car {
	
	private String brand;
	private String model;
	private String color;
	private int passengers;
	private int mpg;
	
	public Car(String brand, String model, String color, int passengers, int mpg) {
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.passengers = passengers;
		this.mpg = mpg;
	}
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public int getMpg() {
		return mpg;
	}

	public void setMpg(int mpg) {
		this.mpg = mpg;
	}
	}