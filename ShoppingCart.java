import java.util.ArrayList;

class Item {
    String name;
    int price;

    Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

public class ShoppingCart {

    ArrayList<Item> cart = new ArrayList<>();

    // Add item
    void addItem(String name, int price) {
        cart.add(new Item(name, price));
    }

    // Remove item
    void removeItem(String name) {
        cart.removeIf(item -> item.name.equals(name));
    }

    // Calculate total price
    int calculateTotal() {
        int total = 0;
        for(Item item : cart) {
            total += item.price;
        }
        return total;
    }

    public static void main(String[] args) {

        ShoppingCart sc = new ShoppingCart();

        // Adding 4 items
        sc.addItem("Book",100);
        sc.addItem("Pen",50);
        sc.addItem("Bag",200);
        sc.addItem("Bottle",150);

        int addCount = 4;

        // Removing 2 items
        sc.removeItem("Pen");
        sc.removeItem("Bottle");

        int removeCount = 2;

        // Calculate total price
        int totalPrice = sc.calculateTotal();

        System.out.println("Add Items = " + addCount);
        System.out.println("Remove Items = " + removeCount);
        System.out.println("Total Price = " + totalPrice);
    }
}
