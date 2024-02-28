/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractfactory;

/**
 *
 * @author syaamil
 */
public class AbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (System.getProperty("os.name").equals("Windows 10")) {
            GUIFactory factory = new WindowsFactory();
            Button button = factory.createButton();
            Checkbox checkbox = factory.createCheckbox();
            
            button.render();
            checkbox.render();

        } else {
            GUIFactory factory = new MacFactory();
            Button button = factory.createButton();
            Checkbox checkbox = factory.createCheckbox();
            
            button.render();
            checkbox.render();
        }
    }

}
