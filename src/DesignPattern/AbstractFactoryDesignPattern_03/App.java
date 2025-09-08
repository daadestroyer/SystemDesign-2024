package DesignPattern.AbstractFactoryDesignPattern_03;

public class App {
	public static void main(String[] args) {
		VechileFactory vechileFactory = new VechileFactory();
		VechileSubFact ovFact = vechileFactory.getVechileFact("ov");
		Vechile alto = ovFact.getVechile("alto");
		alto.average();

		Vechile maruti = ovFact.getVechile("maruti");
		maruti.average();
		
		System.out.println("----------------");
		
		VechileSubFact lvFact = vechileFactory.getVechileFact("lv");
		Vechile bmw = lvFact.getVechile("bmw");
		bmw.average();
		
		Vechile audi = lvFact.getVechile("audi");
		audi.average();

	}
}
