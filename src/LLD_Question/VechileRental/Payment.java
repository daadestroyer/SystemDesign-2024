package LLD_Question.VechileRental;

public class Payment {
    public void payBill(Bill bill) throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Payment Completed");
    }
}
