/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

/**
 *
 * @author syaamil
 */
public class Account {

    String firstName, lastName;
    final String ACCOUNT_DATA_FILE = "AccountData.txt";

    public Account(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean isValid() {

        return getLastName().trim().length() >= 2;
    }

    public boolean save() {

        return FileUtility.writeToFile(ACCOUNT_DATA_FILE, this.toString());
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        String dataLine = "First Name : " + getFirstName() + ", Last Name : " + getLastName();
        return dataLine;
    }
}
