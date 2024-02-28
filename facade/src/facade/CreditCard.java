/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facade;

/**
 *
 * @author syaamil
 */
public class CreditCard {

    String cardType, cardNumber, cardExpDate;
    final String CC_DATA_FILE = "CC.txt";
    public static final String VISA = "Visa";
    public static final String MASTER = "Master";

    public CreditCard(String cardType, String cardNumber, String cardExpDate) {
        this.cardType = cardType;
        this.cardNumber = cardNumber;
        this.cardExpDate = cardExpDate;
    }

    public boolean isValid() {
        return (getCardType().equals("Visa") || getCardType().equals("Master")) && getCardNumber().trim().length() == 16;
    }

    public boolean save() {
        return FileUtility.writeToFile(CC_DATA_FILE, this.toString());
    }

    public String getCardType() {
        return cardType;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardExpDate() {
        return cardExpDate;
    }

    @Override
    public String toString() {
        String dataLine = "Card Type : " + getCardType() + ", Card Number : " + getCardNumber() + ", Card Expiry Date : " + getCardExpDate();
        return dataLine;
    }
}
