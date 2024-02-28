/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package commandv2;

/**
 *
 * @author syaamil
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Item itemA = new Item(1, "Duet");
        Item itemB = new Item(2, "A Beautiful Mind");
        Category CD = new Category("CD");
        Category newRelease = new Category("New Releases");
        Category book = new Category("Book");

        ItemManager IM = new ItemManager();

        AddCommand addCommand1 = new AddCommand(itemA, CD);
        IM.process(addCommand1);

        AddCommand addCommand2 = new AddCommand(itemA, newRelease);
        IM.process(addCommand2);

        System.out.println(itemA);

        DeleteCommand deleteCommand1 = new DeleteCommand(itemA, newRelease);
        IM.process(deleteCommand1);

        System.out.println(itemA);

        AddCommand addCommand3 = new AddCommand(itemB, CD);
        IM.process(addCommand3);
        
        System.out.println(itemB);
        
        MoveCommand moveCommand = new MoveCommand(itemB, CD, book);
        IM.process(moveCommand);

        System.out.println(itemB);
    }

}
