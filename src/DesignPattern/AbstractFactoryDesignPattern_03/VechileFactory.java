package DesignPattern.AbstractFactoryDesignPattern_03;

public class VechileFactory {
	public VechileSubFact getVechileFact(String name) {
		if(name.equalsIgnoreCase("ov")) {
			return new OV_Fact(); 
		}else if(name.equalsIgnoreCase("lv")) {
			return new LV_Fact();
		}
		else {
			return null;
		}
	} 
}
