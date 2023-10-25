import java.util.ArrayList;
import java.util.List;
public class ShoppingCart {
	
	private List<Item> items =new ArrayList<>();
	
	public void addItem(Item item) {
		items.add(item);
	}
	public int getItemCount() {
		return items.size();
	}
	
	public double calculateTotalCost() {
		double totalCost = 0;
		for (Item items : items) {
			totalCost += items.calculateTotal();
		}
		return totalCost;
		}
	
	public void printCart() {
		for (Item items : items) {
			System.out.println("\n Item information: " + items);
			System.out.printf("\n Tax: $ %.2f",  items.calculateTax());
			System.out.printf("\n Total price: $ %.2f \n", items.calculateTotal());
		}
	}
}


