/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objectadapter;

/**
 *
 * @author syaamil
 */
public class ClassAdapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Customer USCustomer = new Customer("Google", "1600 Amphitheatre Parkway", "94043", "CA", "US");

        Customer CACustomer = new Customer("Google", "1600 Amphitheatre Parkway", "94043", "CA", "Canada");

        System.out.println(USCustomer + "\n");

        System.out.println(CACustomer);
    }

}
