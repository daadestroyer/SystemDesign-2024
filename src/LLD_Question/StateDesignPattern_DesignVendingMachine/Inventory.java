package LLD_Question.StateDesignPattern_DesignVendingMachine;

public class Inventory {
    ItemShelf[] inventory = null;

    public Inventory(int itemCount) {
        this.inventory = new ItemShelf[itemCount];
        fittingTheShelfInVendingMachine();
    }

    public void fittingTheShelfInVendingMachine() {
        int startCode = 101;
        for (int i = 0; i < inventory.length; i++) {
            ItemShelf itemShelf = new ItemShelf();
            itemShelf.setCode(startCode);
            itemShelf.setSoldOut(true);
            inventory[i] = itemShelf;
            startCode++;
        }
    }

    public Item getItem(int codeNumber) throws Exception {
        for (ItemShelf itemShelf : inventory) {
            if (itemShelf.isSoldOut()) {
                throw new Exception("item already sold out");
            }
            else{
                return itemShelf.item;
            }
        }
        throw new Exception("Invalid code");
    }

    public void updateSoldOutItem(int codeNumber){
        for(ItemShelf itemShelf : inventory){
            if(itemShelf.getCode() == codeNumber){
                itemShelf.setSoldOut(true);
            }
        }
    }

    public ItemShelf[] getInventory() {
        return inventory;
    }

    public void setInventory(ItemShelf[] inventory) {
        this.inventory = inventory;
    }
}
