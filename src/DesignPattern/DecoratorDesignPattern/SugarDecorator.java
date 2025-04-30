package DesignPattern.DecoratorDesignPattern;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + " ,Sugar";
    }

    public double cost() {
        return coffee.cost() + 10;
    }
}
