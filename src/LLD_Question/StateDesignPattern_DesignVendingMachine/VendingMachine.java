package LLD_Question.StateDesignPattern_DesignVendingMachine;

import StateDesignPattern_DesignVendingMachine.impl.IdleState;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private StateI vendingMachineState;
    private Inventory inventory;
    private List<Coin> coinList;

    public VendingMachine() {
        this.vendingMachineState = new IdleState();
        inventory = new Inventory(10);
        coinList = new ArrayList<>();
    }

    public StateI getVendingMachineState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(StateI vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<Coin> getCoinList() {
        return coinList;
    }

    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }
}
