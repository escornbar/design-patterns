/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandv2;

/**
 *
 * @author syaamil
 */
public class AddCommand implements ICommand {

    Item item;
    Category category;

    public AddCommand(Item item, Category category) {
        this.item = item;
        this.category = category;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public void execute() {
        this.item.categories.put(category.name, category);
        this.category.items.put(item.name, item);
        System.out.printf("Item '%s' has been added to '%s' category.\n", item.name, category.name);
    }

}
