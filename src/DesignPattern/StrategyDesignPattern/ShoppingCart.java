package DesignPattern.StrategyDesignPattern;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentMethod(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount) {
        try{
            System.out.println("Please wait until your transaction complete !");
            Thread.sleep(5000); // simulating processing payment
            paymentStrategy.pay(amount);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

    }

}
