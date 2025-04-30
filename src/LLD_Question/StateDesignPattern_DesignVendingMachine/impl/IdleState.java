package LLD_Question.StateDesignPattern_DesignVendingMachine.impl;


import LLD_Question.StateDesignPattern_DesignVendingMachine.Coin;
import LLD_Question.StateDesignPattern_DesignVendingMachine.Item;
import LLD_Question.StateDesignPattern_DesignVendingMachine.StateI;
import LLD_Question.StateDesignPattern_DesignVendingMachine.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public class IdleState implements StateI {
    public IdleState() {
        System.out.println("Currently Vending machine is in IdleState");
    }

    public IdleState(VendingMachine machine) {
        System.out.println("Currently Vending machine is in IdleState");
        machine.setCoinList(new ArrayList<>());
    }

    @Override
    public void clickOnInsertCoin(VendingMachine machine) {

        machine.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        throw new Exception("you can not insert Coin in idle state");
    }


    @Override
    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        throw new Exception("first you need to click on insert coin button");

    }

    @Override
    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("you can not choose Product in idle state");

    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("you can not get change in idle state");

    }

    @Override
    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        throw new Exception("proeduct can not be dispensed idle state");

    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        throw new Exception("you can not get refunded in idle state");
    }


}
