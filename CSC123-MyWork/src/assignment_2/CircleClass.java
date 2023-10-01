package assignment_2;

import java.text.DecimalFormat;

public class CircleClass {
	
	private String name;
	private double radius;
	

	public CircleClass(String name, double radius) {
		this.name = name;
		this.radius = radius;
	}
	public double Radius() {
		return radius;
	}
	
	public double Area() {
		return Math.PI * (radius * radius);
	}
	
	public double Circumference() {
		return 2 * Math.PI * radius;
	}
	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#.##");
		return name + "\n" + 
				"Radius: " + radius + "\n" +
				"Area: " + df.format(Area()) + "\n" +
				"Circumference: " + df.format(Circumference());
	}		
}