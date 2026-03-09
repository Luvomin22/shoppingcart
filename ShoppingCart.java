import java.util.ArrayList;

class Item {
    String name;
    double price;

    Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class ShoppingCart {

    ArrayList<Item> items = new ArrayList<>();

    public void addItem(String name, double price) {
        items.add(new Item(name, price));
    }

    public void removeItem(String name) {
        items.removeIf(item -> item.name.equals(name));
    }

    public double calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.price;
        }
        return total;
    }
}
