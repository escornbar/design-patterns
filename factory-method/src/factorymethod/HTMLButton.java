/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorymethod;

/**
 *
 * @author syaamil
 */
public class HTMLButton implements Button{

    @Override
    public void render() {
        System.out.println("<button>Button</button>");
    }

    @Override
    public void click() {
        System.out.println("HTML button clicked.");
    }
    
}
