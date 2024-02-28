/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classadapter;

/**
 *
 * @author syaamil
 */
public class Customer {

    public static final String US = "US";
    public static final String CANADA = "Canada";
    private String address;
    private String name;
    private String zip, state, type;

    public Customer(String input_name, String input_address, String input_zip, String input_state, String input_type) {
        name = input_name;
        address = input_address;
        zip = input_zip;
        state = input_state;
        type = input_type;
    }

    public boolean isValidAddress() {
        AddressValidator validator = getValidator(type);
        return validator.isValidAddress(address, zip, state);
    }

    private AddressValidator getValidator(String customerType) {
        AddressValidator validator = null;
        if (customerType.equals(Customer.US)) {
            validator = new USAddress();
        }
        if (customerType.equals(Customer.CANADA)) {
            validator = new CAAdapter();
        }
        return validator;
    }

    @Override
    public String toString() {
        String toReturn = "Customer Name : " + this.name + "\n"
                + "Address : " + this.address + "\n"
                + "Zip/PostalCode : " + this.zip + "\n"
                + "State/Province: " + this.state + "\n"
                + "Address Type : " + this.type + "\n"
                + "Result : " + (this.isValidAddress() ? "Valid " : "Invalid ") + "customer data";
        return toReturn;
    }
}
