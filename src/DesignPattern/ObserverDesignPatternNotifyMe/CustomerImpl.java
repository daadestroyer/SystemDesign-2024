package DesignPattern.ObserverDesignPatternNotifyMe;

public class CustomerImpl implements CustomerI {

	private String customerName;

	public CustomerImpl(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public void update(String productName, boolean inStock) {
		if (inStock) {
			System.out.println("Hello, " + customerName + "! The product '" + productName
					+ "' is back in stock. Hurry up and grab yours!");
		} else {
			System.out.println(
					"Hello, " + customerName + "! The product '" + productName + "' is currently out of stock.");
		}

	}

}
