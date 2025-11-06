package LLD_Question.CarRental;

import java.util.List;

public class VechileRentalSystem {
    List<Store> storeList;
    List<User> userList;

    public VechileRentalSystem(List<Store> storeList, List<User> userList) {
        this.storeList = storeList;
        this.userList = userList;
    }

    public Store getStore(Location location){
        return storeList.get(0);
    }

    // add users

    // remove user

    // add stores

    // remove stores
}

