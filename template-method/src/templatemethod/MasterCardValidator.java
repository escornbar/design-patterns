/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templatemethod;

/**
 *
 * @author syaamil
 */
public class MasterCardValidator extends CardValidator {

    public MasterCardValidator(String cardNumber, int expiryMonth, int expiryYear) {
        super(cardNumber, expiryMonth, expiryYear);
        super.type = "MasterCard";
    }

    @Override
    public boolean isValidLength() {
        if (cardNumber.length() == 16) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isValidPrefix() {
        boolean result = false;
        for (int i = 51; i <= 55; i++) {
            result = result || cardNumber.startsWith(String.valueOf(i));
        }
        return result;
    }

}
