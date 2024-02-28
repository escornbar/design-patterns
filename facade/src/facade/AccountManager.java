/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facade;

/**
 *
 * @author syaamil
 */
public class AccountManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CustomerFacade customer1 = new CustomerFacade(
                new Account("John", "Smith"),
                new Address("101 Jalan Bukit", "Shah Alam", "Selangor"),
                new CreditCard("Visa", "1111222233334444", "01/09/2020")
        );

        CustomerFacade customer2 = new CustomerFacade(
                new Account("Vijaya", "K"),
                new Address("1 Jalan University", "Kuala Lumpur", "Wilayah Persekutuan"),
                new CreditCard("Master", "9999888877776666", "01/01/2022")
        );

        CustomerFacade customer3 = new CustomerFacade(
                new Account("Aryati", "Ahmad"),
                new Address("35 Wisma Jaya", "Petaling Jaya", "Selangor"),
                new CreditCard("Master", "555566667777", "01/05/2023")
        );
        System.out.println("First customer : ");
        customer1.createNewUser();

        System.out.println("\nSecond customer : ");
        customer2.createNewUser();

        System.out.println("\nThird customer : ");
        customer3.createNewUser();
    }

}
