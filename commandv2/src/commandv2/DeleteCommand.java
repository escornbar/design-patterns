/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandv2;

/**
 *
 * @author syaamil
 */
public class DeleteCommand implements ICommand {

    Item item;
    Category category;

    public DeleteCommand(Item item, Category category) {
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
        this.item.categories.remove(category.name);
        this.category.items.remove(item.name);
        System.out.printf("Item '%s' has been deleted from the '%s' category.\n", item.name, category.name);
    }

}
