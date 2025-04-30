package DesignPattern.DecoratorDesignPattern;

public class SimpleCoffee implements Coffee{
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double cost() {
        return 30.0;
    }
}
