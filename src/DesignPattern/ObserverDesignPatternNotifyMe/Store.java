package DesignPattern.ObserverDesignPatternNotifyMe;

public class Store {
	public static void main(String[] args) throws InterruptedException {
		ProductImpl product = new ProductImpl("Iphone");

		// Create customers
		CustomerImpl customer1 = new CustomerImpl("Ram");
		CustomerImpl customer2 = new CustomerImpl("Laxman");

		// Customer hit the notify me button
		product.addCustomer(customer1);
		product.addCustomer(customer2);

		
		// Simulate the stock changes
		product.setInStock(false); // Notify customer that product is out of stock
		
		System.out.println("--------------");
		for (int i = 0; i < 5; i++) {
			System.out.println("Please wait product will back in stock soon");
			Thread.sleep(1000);
		}
		
		System.out.println("--------------");
		product.setInStock(true); // Notify customer that product is in stock now

	}
}
