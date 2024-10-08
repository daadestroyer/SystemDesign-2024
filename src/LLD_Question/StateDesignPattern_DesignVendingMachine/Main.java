package LLD_Question.StateDesignPattern_DesignVendingMachine;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        try {
            System.out.println("|");
            System.out.println("filling up the inventory");
            System.out.println("|");

            fillUpInventory(vendingMachine);
            displayInventory(vendingMachine);

            System.out.println("|");
            System.out.println("clicking on InsertCoinButton");
            System.out.println("|");

            StateI vendingMachineState = vendingMachine.getVendingMachineState();
            vendingMachineState.clickOnInsertCoin(vendingMachine);

            vendingMachineState = vendingMachine.getVendingMachineState();
            vendingMachineState.insertCoin(vendingMachine,Coin.NICKEL);
            vendingMachineState.insertCoin(vendingMachine,Coin.QUARTER);

            System.out.println("|");
            System.out.println("clicking on ProductSelectionButton");
            System.out.println("|");
            vendingMachineState.clickOnStartProductSelectionButton(vendingMachine);

            vendingMachineState = vendingMachine.getVendingMachineState();
            vendingMachineState.chooseProduct(vendingMachine,102);

            System.out.println("--------");
            displayInventory(vendingMachine);

        } catch (Exception e) {

        }
    }

    private static void fillUpInventory(VendingMachine vendingMachine){
        System.out.println("started filling inventory");
        ItemShelf[] slots = vendingMachine.getInventory().getInventory();
        for (int i = 0; i < slots.length; i++) {
            Item newItem = new Item();
            if(i<3) {
                newItem.setItemType(ItemType.COKE);
                newItem.setPrice(12);
            }else if(i<6){
                newItem.setItemType(ItemType.PEPSI);
                newItem.setPrice(9);
            }else if(i<9){
                newItem.setItemType(ItemType.JUICE);
                newItem.setPrice(13);
            }else if(i<12){
                newItem.setItemType(ItemType.SODA);
                newItem.setPrice(7);
            }
            slots[i].setItem(newItem);
            slots[i].setSoldOut(false);
        }
        System.out.println("inventory fulled");
    }

    private static void displayInventory(VendingMachine vendingMachine){

        ItemShelf[] slots = vendingMachine.getInventory().getInventory();
        for (int i = 0; i < slots.length; i++) {

            System.out.println("CodeNumber: " + slots[i].getCode() +
                    " Item: " + slots[i].getItem().getItemType().name() +
                    " Price: " + slots[i].getItem().getPrice() +
                    " isAvailable: " + !slots[i].isSoldOut());
        }
    }
}
