package LLD_Question.VechileRental;

import LLD_Question.VechileRental.Product.Vechile;

import java.util.List;

public class VechileInventoryManagement {
    List<Vechile> vechileList;

    public VechileInventoryManagement(List<Vechile> vehicles) {
        this.vechileList = vehicles;
    }

    public void addVechile(Vechile vechile) {
        vechileList.add(vechile);
    }

    public List<Vechile> getAllVechile() {
        return vechileList;
    }

    public Vechile getVechileById(int vechileId) {
        for (Vechile vechile : vechileList) {
            if (vechile.vehicleID == vechileId) {
                return vechile;
            }
        }
        return null;
    }

    public void deleteVechile(int vechileId) {
        for (Vechile vechile : vechileList) {
            if (vechile.vehicleID == vechileId) {
                vechileList.remove(vechile);
                System.out.println("Vechile " + vechileId + " removed");
            }
        }
        System.out.println("vechile with id " + vechileId + " not found");
    }
}
