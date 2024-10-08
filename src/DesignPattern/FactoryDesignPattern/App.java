package DesignPattern.FactoryDesignPattern;

public class App {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		ShapeI shapeI = shapeFactory.getShapeObject("circle");
		shapeI.getShape();
		
	}
}
