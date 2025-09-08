package DesignPattern.AbstractFactoryDesignPattern_03;

public class OV_Fact implements VechileSubFact {

	@Override
	public Vechile getVechile(String name) {
		if (name.equalsIgnoreCase("alto")) {
			return new Alto();
		} else if (name.equalsIgnoreCase("maruti")) {
			return new Maruti();
		} else {
			return null;
		}
	}

}
