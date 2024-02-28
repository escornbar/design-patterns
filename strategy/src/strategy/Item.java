package strategy;

/**
 *
 * @author syaamil
 */
public class Item {

    private String id;
    private String name;
    private double price;

    public Item(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getItemId() {
        return id;
    }
    
    public String getItemName() {
        return name;
    }

    public double getItemPrice() {
        return price;
    }
}
