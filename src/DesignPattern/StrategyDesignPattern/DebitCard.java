package DesignPattern.StrategyDesignPattern;

public class DebitCard implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Paid ₹" + amount + " using Debit Card");
    }
}
