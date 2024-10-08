package DesignPattern.NullObjectDesignPattern;

public class MainApp {
	public static void main(String[] args) {
		VechileFactory vechileFactory = new VechileFactory();
		Vechile carVechile = vechileFactory.getVechile("car");
		System.out.println(carVechile.getSeatCapacity());
		System.out.println(carVechile.getTankCapacity());
		System.out.println("------");
		Vechile bikeVechile = vechileFactory.getVechile("bike");
		System.out.println(bikeVechile.getSeatCapacity());
		System.out.println(bikeVechile.getTankCapacity());
		System.out.println("------");
		
		// here this is the problem that if user give anything else then in this case what we will do
		// problem 
		/*
			Vechile rocketVechile = vechileFactory.getVechile("Rocket");
			System.out.println(rocketVechile.getSeatCapacity());
			System.out.println(rocketVechile.getTankCapacity());
		*/
		
		
		// update 
		Vechile rocketVechile = vechileFactory.getVechile("Rocket");
		System.out.println(rocketVechile.getSeatCapacity());
		System.out.println(rocketVechile.getTankCapacity());
		
	}
}
