/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorymethod;

/**
 *
 * @author syaamil
 */
public class FactoryMethod {

    /**
     * @param args the command line arguments
     */
    private static Dialog dialog;
    
    public static void main(String[] args) {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HTMLDialog();
        }
        
        dialog.renderWindow();
    }

}
