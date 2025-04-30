package LLD_Question.StateDesignPattern_DesignVendingMachine;

import java.util.List;

public interface StateI {
    public void clickOnInsertCoin(VendingMachine machine) throws Exception;

    public void insertCoin(VendingMachine machine,Coin coin) throws Exception;

    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception;

    public void chooseProduct(VendingMachine machine,int codeNumber) throws Exception;

    public int getChange(int returnChangeMoney) throws Exception;

    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception;

    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception;

}
