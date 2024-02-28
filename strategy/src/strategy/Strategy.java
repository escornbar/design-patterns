package strategy;

import java.util.Scanner;

/**
 *
 * @author syaamil
 */
public class Strategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cart cart = new Cart();
        Scanner input = new Scanner(System.in);

        Item apple = new Item("1", "Apple", 2.50);
        Item orange = new Item("2", "Orange", 3.00);
        Item nutella = new Item("3", "Nutella", 7.00);

        cart.addItem(nutella);
        cart.addItem(apple);
        cart.addItem(orange);
        cart.removeItem(orange);

        System.out.println("Choose your payment method: [1] Paypal | [2] Credit Card | [3] Cash");
        int chosenPaymentMethod = input.nextByte();

        switch(chosenPaymentMethod){
            case 1:
                cart.pay(new PayPalStrategy("email@gmail.com", "password123"));
                break;
            case 2:
                cart.pay(new CreditCardStrategy("Syaamil Faiq", "1234567890", "123", "12/24"));
                break;
            case 3:
                cart.pay(new CashStrategy());
                break;
            default:
                System.out.println("You decided to steal the whole cart dude.");
        }

    }

}
