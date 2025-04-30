package DesignPattern.StrategyDesignPattern;

public class App {
    public static void main(String[] args) {
        // 1. create shopping cart
        ShoppingCart shoppingCart = new ShoppingCart();

        // 2. select payment method
        shoppingCart.setPaymentMethod(new UPI());

        // 3. pay amount
        shoppingCart.checkout(2000);

    }
}
