package DesignPattern.AbstractFactoryDesignPattern_03;

public class LV_Fact implements VechileSubFact {

	@Override
	public Vechile getVechile(String name) {
		if(name.equalsIgnoreCase("bmw")) {
			return new BMW();
		}
		else if(name.equalsIgnoreCase("audi")) {
			return new Audi();
		}
		else {
			return null;
		}
	}

}
