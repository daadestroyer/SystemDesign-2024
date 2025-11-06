package LLD_Question.VechileRental;

import LLD_Question.VechileRental.Product.Car;
import LLD_Question.VechileRental.Product.Vechile;
import LLD_Question.VechileRental.enums.VechileType;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<Vechile> addVehicles() {

        List<Vechile> vehicles = new ArrayList<>();

        Vechile vehicle1 = new Car();
        vehicle1.setVehicleID(1);
        vehicle1.setVehicleType(VechileType.CAR);

        Vechile vehicle2 = new Car();
        vehicle1.setVehicleID(2);
        vehicle1.setVehicleType(VechileType.CAR);

        vehicles.add(vehicle1);
        vehicles.add(vehicle2);

        return vehicles;
    }

    public static List<User> addUsers() {

        List<User> users = new ArrayList<>();
        User user1 = new User();
        user1.setUserId(1);

        users.add(user1);
        return users;
    }

    public static List<Store> addStores(List<Vechile> vehicles) {

        List<Store> stores = new ArrayList<>();
        Store store1 = new Store();
        store1.storeId = 1;
        store1.setVehicles(vehicles);

        stores.add(store1);
        return stores;
    }

    public static void main(String[] args) {
        List<User> users = addUsers();
        List<Vechile> vehicles = addVehicles();
        List<Store> stores = addStores(vehicles);
        VechileRentalSystem rentalSystem = new VechileRentalSystem(stores, users);

        //0. User comes
        User user = users.get(0);

        //1. user search store based on location
        Location location = new Location(403012, "Bangalore", "Karnataka", "India");
        Store store = rentalSystem.getStore(location);

        //2. get All vehicles you are interested in (based upon different filters)
        List<Vechile> storeVehicles = store.getVehicles(VechileType.CAR);


        //3.reserving the particular vehicle
        Reservation reservation = store.createReservation(storeVehicles.get(0), users.get(0));

    }
}
