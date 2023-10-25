import java.util.ArrayList;
import java.util.List;
public class Food extends Item {
	
	private String sellByDate;
	private String useByDate;
	
	public Food(String name, String vendor, double price, double cost, double weight, double taxRate, String sellByDate, String useByDate) {
		super(name, vendor, price, cost, weight, taxRate);
		this.sellByDate = sellByDate;
		this.useByDate = useByDate;
	}

	@Override
	public String toString() {
		return super.toString() + "\n Food [sellByDate: " + sellByDate + ", useByDate: " + useByDate + "]";
	}
}
