/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectadapter;

/**
 *
 * @author syaamil
 */
public class CAAdapter extends AddressValidator {
    CAAddress canadianAddress = new CAAddress();
    
    public CAAdapter(CAAddress canadianAddress){
        this.canadianAddress = canadianAddress;
    }
    
    
    @Override
    public boolean isValidAddress(String input_address, String input_zip, String input_state) {
        return this.canadianAddress.isValidCanadianAddress(input_address, input_zip, input_state);
    }

}
