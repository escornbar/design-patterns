package strategy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author syaamil
 */
public class Cart {

    List<Item> itemsList;

    public Cart() {
        this.itemsList = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        this.itemsList.add(item);
        System.out.println(item.getItemName() + " added to cart.");
    }

    public void removeItem(Item item) {
        this.itemsList.remove(item);
        System.out.println(item.getItemName() + " removed from cart.");
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (Item item : itemsList) {
            total += item.getItemPrice();
        }
        return total;
    }

    public void pay(PaymentStrategy paymentMethod) {
        System.out.print("Cart: ");
        for(Item item:itemsList){
            System.out.print(item.getItemName()+" ");
        }
        double amount = calculateTotalPrice();
        System.out.println("\nTotal: RM"+amount);
        paymentMethod.pay(amount);
    }
}
