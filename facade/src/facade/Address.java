/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

/**
 *
 * @author syaamil
 */
public class Address {

    String address, city, state;
    final String ADDRESS_DATA_FILE = "AddressFile.txt";

    public Address(String address, String city, String state) {
        this.address = address;
        this.city = city;
        this.state = state;
    }

    public boolean isValid() {
        return getAddress().trim().length() >= 2;
    }

    public boolean save() {
        return FileUtility.writeToFile(ADDRESS_DATA_FILE, this.toString());
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        String dataLine = "Address : " + getAddress() + ", City : " + getCity() + ", State : " + getState();
        return dataLine;
    }
}
