package LLD_Question.StateDesignPattern_DesignVendingMachine.impl;

import StateDesignPattern_DesignVendingMachine.Coin;
import StateDesignPattern_DesignVendingMachine.Item;
import StateDesignPattern_DesignVendingMachine.StateI;
import StateDesignPattern_DesignVendingMachine.VendingMachine;

import java.util.List;

public class DispenseState implements StateI {

    DispenseState(VendingMachine machine, int codeNumber) throws Exception{
        System.out.println("Currently Vending machine is in DispenseState");
        dispenseProduct(machine, codeNumber);
    }

    @Override
    public void clickOnInsertCoin(VendingMachine machine) throws Exception {
        throw new Exception("insert coin button can not clicked on Dispense state");

    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("coin can not be inserted in Dispense state");

    }



    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("product selection buttion can not be clicked in Dispense state");

    }

    @Override
    public void chooseProduct(VendingMachine machine,int codeNumber) throws Exception {
        throw new Exception("product can not be choosen in Dispense state");

    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("change can not returned in Dispense state");

    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        System.out.println("Product has been dispensed");
        Item item = machine.getInventory().getItem(codeNumber);
        machine.getInventory().updateSoldOutItem(codeNumber);
        machine.setVendingMachineState(new IdleState());
        return item;

    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) {

        return null;
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) {

    }
}
