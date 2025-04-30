package DesignPattern.StrategyDesignPattern;

public class UPI implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid ₹" + amount + " using UPI");
    }
}
