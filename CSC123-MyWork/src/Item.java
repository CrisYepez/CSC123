import java.util.ArrayList;
import java.util.List;

public class Item {

	private String name;
	private String vendor;
	private double price;
	private double cost;
	private double weight;
	private double taxRate;
	
	public Item(String name, String vendor, double price, double cost, double weight, double taxRate) {
		super();
		this.name = name;
		this.vendor = vendor;
		this.price = price;
		this.cost = cost;
		this.weight = weight;
		this.taxRate = taxRate;
	}

	public String getName() {
		return name;
	}

	public String getVendor() {
		return vendor;
	}

	public double getPrice() {
		return price;
	}

public double getCost() {
		return cost;
	}

public double getWeight() {
		return weight;
	}

public double getTaxRate() {
		return taxRate;
	}

public double calculateTax() {
	return (price - cost) * taxRate / 100;
}

public double calculateTotal() {
	return price + calculateTax();
}

@Override
public String toString() {
	return "Items [name: " + name + ", vendor: " + vendor + ", price: " + price + ", cost: " + cost + ", weight: "
			+ weight + ", taxRate: " + taxRate + "]";
	}
}


