package DesignPattern.StrategyDesignPattern;

public class Main {
	public static void main(String[] args) {
			VechileFactory normalVechileFactory = new VechileFactory(new NormalVechile());
			normalVechileFactory.drive();
			
			System.out.println("-----");
			
			VechileFactory offRoadVechileFactory = new VechileFactory(new OffRoadVechile());
			offRoadVechileFactory.drive();
			
			System.out.println("-----");
			
			VechileFactory sporVechileFactory = new VechileFactory(new SportsVechile());
			sporVechileFactory.drive();
	}
}
