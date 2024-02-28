/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templatemethod;

/**
 *
 * @author syaamil
 */
public class VisaCardValidator extends CardValidator {

    public VisaCardValidator(String cardNumber, int expiryMonth, int expiryYear) {
        super(cardNumber, expiryMonth, expiryYear);
        super.type = "Visa";
    }

    @Override
    public boolean isValidLength() {
        if (cardNumber.length() == 13 || cardNumber.length() == 16) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isValidPrefix() {
        if (cardNumber.startsWith("4")) {
            return true;
        }
        return false;
    }

}
