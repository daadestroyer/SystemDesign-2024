package DesignPattern.FactoryDesignPattern_02;

public class App {
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		ShapeI shapeI = shapeFactory.getShapeObject("circle");
		shapeI.getShape();
		
	}
}
