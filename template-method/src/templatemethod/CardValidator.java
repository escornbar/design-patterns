/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templatemethod;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author syaamil
 */
public abstract class CardValidator {

    String type;
    String cardNumber;
    int expiryMonth;
    int expiryYear;

    public CardValidator(String cardNumber, int expiryMonth, int expiryYear) {
        this.cardNumber = cardNumber;
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
    }

    public final boolean validate() {
        if (!isExpired()) {
            System.out.println("Expired card");
            return false;
        }
        if (!isValidLength()) {
            System.out.println("Invalid card number");
            return false;
        }
        if (!isValidPrefix()) {
            System.out.println("Invalid prefix for card number");
            return false;
        }
        if (!isValidCharacters()) {
            System.out.println("Invalid characters found. Card number should only contain numbers.");
            return false;
        }
        if (!isValidCheckSum()) {
            System.out.println("Invalid check sum");
            return false;
        }

        if (!isAccountInGoodStand()) {
            System.out.println("Outstanding balance");
            return false;
        }
        return true;
    }

    public boolean isExpired() {
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int currentMonth = localDate.getMonthValue();
        int currentYear = localDate.getYear();

        if (this.expiryYear > currentYear) {
            if (this.expiryMonth > currentMonth) {
                return false;
            }
            return false;
        }
        return true;
    }

    public abstract boolean isValidLength();

    public abstract boolean isValidPrefix();

    public boolean isValidCharacters() {
        if (!this.cardNumber.matches("\\d+")) {
            return false;
        }
        return true;
    }

    private boolean isValidCheckSum() {
        boolean result = true;
        int sum = 0;
        int multiplier = 1;
        int strLen = this.cardNumber.length();
        for (int i = 0; i < strLen; i++) {
            String digit = this.cardNumber.substring(strLen - i - 1, strLen - i);
            int currProduct = new Integer(digit).intValue() * multiplier;
            if (currProduct >= 10) {
                sum += (currProduct % 10) + 1;
            } else {
                sum += currProduct;
            }
            if (multiplier == 1) {
                multiplier++;
            } else {
                multiplier--;
            }
        }
        if ((sum % 10) != 0) {
            result = false;
        }
        return result;
    }

    public boolean isAccountInGoodStand() {
        return true;
    }

    @Override
    public String toString() {
        return "Card Type = " + type + ", Card Number = " + cardNumber + ", Expiry Month = " + expiryMonth + ", Expiry Year = " + expiryYear;
    }
}
