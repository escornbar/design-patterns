/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classadapter;

/**
 *
 * @author syaamil
 */
public class CAAddress {

    public boolean isValidCanadianAddress(String input_address, String input_province_code, String input_province) {
        if (input_address.trim().length() < 15) {
            return false;
        }
        if (input_province_code.trim().length() != 6) {
            return false;
        }
        if (input_province.trim().length() < 6) {
            return false;
        }
        return true;
    }

}
