package LLD_Question.CarRental;

import LLD_Question.CarRental.enums.PaymentMode;

import java.util.Date;

public class Invoice {
    int paymentId;
    int amountPaid;
    Date dateOfPayment;
    boolean isRefundable;
    PaymentMode paymentMode;
}
