    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandv2;

/**
 *
 * @author syaamil
 */
public class ItemManager {

//    ICommand command;
//    public void setCommand(ICommand command) {
//        this.command = command;
//    }
    public void process(ICommand command) {
        command.execute();
    }
}
