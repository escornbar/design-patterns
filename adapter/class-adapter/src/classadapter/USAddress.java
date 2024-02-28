/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classadapter;

/**
 *
 * @author syaamil
 */
public class USAddress implements AddressValidator {

    @Override
    public boolean isValidAddress(String input_address, String input_zip, String input_state) {
        if (input_address.trim().length() < 10) {
            return false;
        }
        if (input_zip.trim().length() < 5) {
            return false;
        }
        if (input_zip.trim().length() > 10) {
            return false;
        }
        if (input_state.trim().length() != 2) {
            return false;
        }
        return true;
    }

}
