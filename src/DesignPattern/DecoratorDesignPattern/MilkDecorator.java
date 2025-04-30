package DesignPattern.DecoratorDesignPattern;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }
    public double getCost() {
        return super.cost() + 30;
    }
}
