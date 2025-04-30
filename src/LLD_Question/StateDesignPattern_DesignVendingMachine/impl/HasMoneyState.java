package LLD_Question.StateDesignPattern_DesignVendingMachine.impl;


import LLD_Question.StateDesignPattern_DesignVendingMachine.Coin;
import LLD_Question.StateDesignPattern_DesignVendingMachine.Item;
import LLD_Question.StateDesignPattern_DesignVendingMachine.StateI;
import LLD_Question.StateDesignPattern_DesignVendingMachine.VendingMachine;

import java.util.List;

public class HasMoneyState implements StateI {

    public HasMoneyState() {
        System.out.println("Currently Vending machine is in HasMoneyState");
    }

    @Override
    public void clickOnInsertCoin(VendingMachine machine) {
        return;
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) {
        System.out.println("Accepted the coin");
        machine.getCoinList().add(coin);
    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) {
        machine.setVendingMachineState(new SelectionState());
    }

    @Override
    public void chooseProduct(VendingMachine machine,int codeNumber) throws Exception {
        throw new Exception("you need to click on start product selection button first");

    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("you can not get change in hasMoney state");

    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("product can not be dispensed in hasMoney state");

    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) {
        System.out.println("Returned the full amount back in the Coin Dispense Tray");
        machine.setVendingMachineState(new IdleState());
        return machine.getCoinList();
    }


}
