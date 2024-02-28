/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classadapter;

/**
 *
 * @author syaamil
 */
public class CAAdapter extends CAAddress implements AddressValidator {

    @Override
    public boolean isValidAddress(String input_address, String input_zip, String input_state) {
        return this.isValidCanadianAddress(input_address, input_zip, input_state);
    }

}
