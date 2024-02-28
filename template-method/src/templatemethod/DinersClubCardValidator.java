/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templatemethod;

/**
 *
 * @author syaamil
 */
public class DinersClubCardValidator extends CardValidator {

    public DinersClubCardValidator(String cardNumber, int expiryMonth, int expiryYear) {
        super(cardNumber, expiryMonth, expiryYear);
        super.type = "DinersClub";
    }

    @Override
    public boolean isValidLength() {
        if (cardNumber.length() == 14) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isValidPrefix() {
        String[] prefixArray = {"30", "36", "38"};
        boolean result = false;
        for (int i = 0; i <= prefixArray.length; i++) {
            result = result || cardNumber.startsWith(prefixArray[i]);
        }
        return result;
    }

}
