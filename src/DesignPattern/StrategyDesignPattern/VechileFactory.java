package DesignPattern.StrategyDesignPattern;

public class VechileFactory {

	private VechileI vechileI;

	public VechileFactory(VechileI vechileI) {
		super();
		this.vechileI = vechileI;
	}

	public void drive() {
		this.vechileI.drive();
	}
}
