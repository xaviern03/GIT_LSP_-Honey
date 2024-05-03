package org.howard.edu.lsp.oopfinal.question2;

import org.howard.edu.lsp.oopfinal.question2.CreditCardPayment;
import org.howard.edu.lsp.oopfinal.question2.PayPalPayment;
import org.howard.edu.lsp.oopfinal.question2.BitcoinPayment;

public class PaymentStrategyDriver {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Using credit card payment
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456"));
        cart.checkout(100.0);

        // Using PayPal payment
        cart.setPaymentStrategy(new PayPalPayment("user@example.com"));
        cart.checkout(50.0);

        // Using Bitcoin payment
        cart.setPaymentStrategy(new BitcoinPayment("1AaBbCcDdEeFfGgHh"));
        cart.checkout(75.0);
    }
}