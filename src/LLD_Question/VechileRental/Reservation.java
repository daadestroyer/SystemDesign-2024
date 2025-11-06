package LLD_Question.VechileRental;

import LLD_Question.VechileRental.Product.Vechile;
import LLD_Question.VechileRental.enums.ReservationStatus;
import LLD_Question.VechileRental.enums.ReservationType;

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

    public int createReserve(User user, Vechile vehicle){

        //generate new id
        reservationId = 12232;
        this.user=user;
        this.vehicle=vehicle;
        reservationType = ReservationType.DAILY;
        reservationStatus = ReservationStatus.SCHEDULED;

        return reservationId;
    }

    // CRUD operations
}
