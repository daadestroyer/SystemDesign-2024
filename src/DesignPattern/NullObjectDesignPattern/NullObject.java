package DesignPattern.NullObjectDesignPattern;

// UPDATE : 
// Null Object Design Pattern
public class NullObject implements Vechile{

	@Override
	public int getSeatCapacity() {
		return 0;
	}

	@Override
	public String getTankCapacity() {
		return null;
	}

}
