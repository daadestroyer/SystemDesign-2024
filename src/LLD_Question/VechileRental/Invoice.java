package LLD_Question.VechileRental;

import LLD_Question.VechileRental.enums.PaymentMode;

import java.util.Date;

public class Invoice {
    int paymentId;
    int amountPaid;
    Date dateOfPayment;
    boolean isRefundable;
    PaymentMode paymentMode;
}
