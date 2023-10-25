
public class DriverShoppingCart {

	public static void main(String[] args) {
		
		Publication book=new Publication("The Great Gatsby", "Random House", 12.99, 6.99, 2.0, 10.0, "F. Scott Fitzgerald", "June 1925", 180 );
		
		Food orange=new Food("Orange", "Farm", 1.0, 0.5, 0.25, 5.0, "10/24/23", "11/01/23");
		
		Item toothpaste=new Item("toothpaste", "Target", 2.99, 1.99, 0.5, 8.0);
		
		ShoppingCart cart=new ShoppingCart();
		cart.addItem(book);
		cart.addItem(orange);
		cart.addItem(toothpaste);
		
		System.out.println("Items in shopping cart: ");
		cart.printCart();
		
		System.out.printf("\n Total cost of Items in the shopping cart: $ %.2f", cart.calculateTotalCost());
	}
}
