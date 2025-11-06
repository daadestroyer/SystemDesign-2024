package LLD_Question.CarRental;

import LLD_Question.CarRental.Product.Vechile;
import LLD_Question.CarRental.enums.ReservationStatus;
import LLD_Question.CarRental.enums.ReservationType;

import java.util.Date;

public class Reservation {
    int reservationId;
    User user;
    Vechile vehicle;
    Date bookingDate;
    Date dateBookedFrom;
    Date dateBookedTo;
    Long fromTimeStamp;
    Long toTimeStamp;
    Location pickUpLocation;
    Location dropLocation;
    ReservationType reservationType;
    ReservationStatus reservationStatus;
    Location location;
}
