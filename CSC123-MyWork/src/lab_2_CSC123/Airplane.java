package lab_2_CSC123;

public class Airplane {
	
	private String model;
	private String color;
	private int passengers;
	private double luggageWeight;
	private int crew;
	
	public Airplane(String model, String color, int passengers, double luggageWeight, int crew) {
	this.model = model;
	this.color = color;
	this.passengers = passengers;
	this.luggageWeight = luggageWeight;
	this.crew = crew;
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
	public double getLuggageWeight() {
		return luggageWeight;
	}
	public void setLuggageWeight(double luggageWeight) {
		this.luggageWeight = luggageWeight;
	}
	public int getCrew() {
		return crew;
	}
	public void setCrew(int crew) {
		this.crew = crew;
	}
}