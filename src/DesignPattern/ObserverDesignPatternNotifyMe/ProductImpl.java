package DesignPattern.ObserverDesignPatternNotifyMe;

import java.util.ArrayList;

public class ProductImpl implements ProductI {
	private String productName;
	private boolean inStock;
	private ArrayList<CustomerI> customerList;

	public ProductImpl(String productName) {
		this.productName = productName;
		this.customerList = new ArrayList<>();
	}

	public void setInStock(boolean inStock) {
		this.inStock = inStock;
		notifyCustomer();
	}

	@Override
	public void addCustomer(CustomerI customer) {
		this.customerList.add(customer);
	}

	@Override
	public void removeCustomer(CustomerI customer) {
		this.customerList.remove(customer);
	}

	@Override
	public void notifyCustomer() {
		for(CustomerI customer : customerList) {
			customer.update(productName,inStock);
		}
	}

}
