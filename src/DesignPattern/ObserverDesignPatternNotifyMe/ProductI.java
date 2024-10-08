package DesignPattern.ObserverDesignPatternNotifyMe;

public interface ProductI {
	public void addCustomer(CustomerI customer);

	public void removeCustomer(CustomerI customer);

	public void notifyCustomer();

}
