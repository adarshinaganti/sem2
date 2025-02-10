package src;
// Create a shopping cart class

class ShoppingCart {
    class Item {
        private String itemName;
        private int quantity;
        private float price;

        public Item(String itemName, int quantity, float price) {
            this.itemName = itemName;
            this.quantity = quantity;
            this.price = price;
        }

        public String toString() {
            return itemName + " - Quantity: " + quantity + ", Price: $" + String.format("%.2f", price);
        }
    }

    private Item[] items;
    private int itemCount;

    public ShoppingCart() {
        this.items = new Item[10];
        this.itemCount = 0;
    }

    public void addItem(String itemName, int quantity, float price) {
        if (itemCount < items.length) {
            items[itemCount++] = new Item(itemName, quantity, price);
        } else {
            System.out.println("Cart is full!");
        }
    }

    public float calculateTotal() {
        float total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].quantity * items[i].price;
        }
        return total;
    }

    public void displayCart() {
        if (itemCount == 0) {
            System.out.println("The shopping cart is empty.");
        }
		else {
            System.out.println("Shopping Cart Contents:");
            for (int i = 0; i < itemCount; i++) {
                System.out.println(items[i]);
            }
            System.out.println("Total Price: $" + String.format("%.2f", calculateTotal()));
        }
    }
}

public class Program21 {
	public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Laptop", 1, 999.99f);
        cart.addItem("Mouse", 2, 25.50f);
        cart.displayCart();
    }
}