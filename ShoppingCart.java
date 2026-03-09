import java.util.*;

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

    void addItem(String name, int price) {
        cart.add(new Item(name, price));
    }

    void removeItem(String name) {
        cart.removeIf(item -> item.name.equals(name));
    }

    int calculateTotal() {
        int total = 0;
        for(Item item : cart) {
            total += item.price;
        }
        return total;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();

        System.out.print("Enter number of items to add: ");
        int add = sc.nextInt();

        for(int i=1;i<=add;i++){
            System.out.print("Enter item name: ");
            String name = sc.next();
            System.out.print("Enter price: ");
            int price = sc.nextInt();
            cart.addItem(name,price);
        }

        System.out.print("Enter number of items to remove: ");
        int remove = sc.nextInt();

        for(int i=1;i<=remove;i++){
            System.out.print("Enter item name to remove: ");
            String name = sc.next();
            cart.removeItem(name);
        }

        System.out.println("Add Items = " + add);
        System.out.println("Remove Items = " + remove);
        System.out.println("Total Price = " + cart.calculateTotal());
    }
}
