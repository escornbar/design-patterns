/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

/**
 *
 * @author syaamil
 */
public class CustomerFacade {

    private Account account;
    private Address address;
    private CreditCard creditCard;

    public CustomerFacade(Account account, Address address, CreditCard creditCard) {
        this.account = account;
        this.address = address;
        this.creditCard = creditCard;
    }

    public void createNewUser() {
        System.out.println(this.account);
        System.out.println(this.address);
        System.out.println(this.creditCard);

        System.out.println((this.account.isValid() ? "Valid" : "Invalid") + " First Name/Last Name");
        System.out.println((this.address.isValid() ? "Valid" : "Invalid") + " Address/City/State");
        System.out.println((this.creditCard.isValid() ? "Valid" : "Invalid") + " Credit Card");

        if (this.account.isValid() && this.address.isValid() && this.creditCard.isValid()) {
            this.account.save();
            this.address.save();
            this.creditCard.save();
            System.out.println("Valid customer data --- Data saved successfully!");
        } else {
            System.out.println("Invalid customer data --- Data could not be saved!");
        }
    }
}
