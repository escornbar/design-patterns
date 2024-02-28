/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandv2;

/**
 *
 * @author syaamil
 */
public class MoveCommand implements ICommand {

    Item item;
    Category initCategory;
    Category finalCategory;

    public MoveCommand(Item item, Category initCategory, Category finalCategory) {
        this.item = item;
        this.initCategory = initCategory;
        this.finalCategory = finalCategory;
    }

    @Override
    public void execute() {
        System.out.printf("Move '%s' from '%s' category to '%s' category\n", this.item.name, this.initCategory.name, this.finalCategory.name);
        DeleteCommand deleteCommand = new DeleteCommand(this.item, this.initCategory);
        deleteCommand.execute();
        AddCommand addCommand = new AddCommand(this.item, this.finalCategory);
        addCommand.execute();
    }
}
