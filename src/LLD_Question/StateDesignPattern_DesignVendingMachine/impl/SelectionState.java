package LLD_Question.StateDesignPattern_DesignVendingMachine.impl;


import LLD_Question.StateDesignPattern_DesignVendingMachine.Coin;
import LLD_Question.StateDesignPattern_DesignVendingMachine.Item;
import LLD_Question.StateDesignPattern_DesignVendingMachine.StateI;
import LLD_Question.StateDesignPattern_DesignVendingMachine.VendingMachine;

import java.util.List;

public class SelectionState implements StateI {

    public SelectionState() {
        System.out.println("Currently Vending machine is in SelectionState");
    }

    @Override
    public void clickOnInsertCoin(VendingMachine machine) throws Exception {
        throw new Exception("you can not click on insert coin button in Selection state");

    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("you can not insert Coin in selection state");

    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) {
        return;
    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        // 1. get item of this code number
        Item item = machine.getInventory().getItem(codeNumber);

        // 2. total amount paid by user
        int paidByUser = 0;
        for (Coin coin : machine.getCoinList()) {
            paidByUser = paidByUser + coin.value;
        }

        // 3. compare product price and price paid by user
        if (paidByUser < item.getPrice()) {
            System.out.println("Insufficient Amount, Product you selected is for price: " + item.getPrice() + " and you paid: " + paidByUser);
            refundFullMoney(machine);
            throw new Exception("insufficient amount");
        } else if (paidByUser >= item.getPrice()) {
            if (paidByUser > item.getPrice()) {
                getChange(paidByUser - item.getPrice());
            }
            machine.setVendingMachineState(new DispenseState(machine, codeNumber));
        }
    }

    @Override
    public int getChange(int returnExtraMoney) {
        //actual logic should be to return COINs in the dispense tray, but for simplicity i am just returning the amount to be refunded
        System.out.println("Returned the change in the Coin Dispense Tray: " + returnExtraMoney);
        return returnExtraMoney;
    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("product can not be dispensed Selection state");

    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        System.out.println("Returned the full amount back in the Coin Dispense Tray");
        machine.setVendingMachineState(new IdleState());
        return machine.getCoinList();
    }



}
