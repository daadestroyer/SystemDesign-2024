package LLD_Question.VechileRental;

import LLD_Question.VechileRental.Product.Vechile;
import LLD_Question.VechileRental.enums.VechileType;

import java.util.List;

public class Store {
    int storeId;
    Location storeLocation;
    List<Reservation> reservationList;
    VechileInventoryManagement vechileInventoryManagement;


    public List<Vechile> getVehicles(VechileType vehicleType) {

        return vechileInventoryManagement.getAllVechile();
    }


    //addVehicles, update vehicles, use inventory management to update those.


    public void setVehicles(List<Vechile> vehicles) {
        vechileInventoryManagement = new VechileInventoryManagement(vehicles);
    }

    public Reservation createReservation(Vechile vehicle, User user){
        Reservation reservation = new Reservation();
        reservation.createReserve(user,vehicle);
        reservationList.add(reservation);
        return reservation;
    }

    public boolean completeReservation(int reservationID) {
        //take out the reservation from the list and call complete the reservation method.
        return true;
    }

    //update reservation
}
