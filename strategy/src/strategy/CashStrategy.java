/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

/**
 *
 * @author syaamil
 */
public class CashStrategy implements PaymentStrategy {

    public CashStrategy() {

    }

    @Override
    public void pay(double amount) {
        System.out.println("RM" + amount + " paid with cash.");
    }

}
