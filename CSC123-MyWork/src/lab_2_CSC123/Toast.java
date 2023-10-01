package lab_2_CSC123;

public class Toast {

	private String brand;
	private int modelNumber;
	private String color;
	private int numOfSlices;
	private String heat;
	
	public void Toast(String brand, int modelNumber, String color, int numOfSlices, String heat) {
		this.brand = brand;
		this.color = color;
		this.modelNumber = modelNumber;
		this.numOfSlices = numOfSlices;
		this.heat= heat;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(int modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumOfSlices() {
		return numOfSlices;
	}

	public void setNumOfSlices(int numOfSlices) {
		this.numOfSlices = numOfSlices;
	}

	public String getHeat() {
		return heat;
	}

	public void setHeat(String heat) {
		this.heat = heat;
	}
	
	
	
}
