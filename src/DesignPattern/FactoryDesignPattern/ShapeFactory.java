package DesignPattern.FactoryDesignPattern;

public class ShapeFactory {
	public ShapeI getShapeObject(String shapeName) {
		if (shapeName.equalsIgnoreCase("circle")) {
			return new Circle();
		} else if (shapeName.equalsIgnoreCase("rectangle")) {
			return new Rectangle();
		} else {
			return null;
		}

	}
}
