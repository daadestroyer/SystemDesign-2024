package DesignPattern.DecoratorDesignPattern.Decorator;

import DesignPattern.DecoratorDesignPattern.Coffee;

public class MilkDecorator extends CoffeeDecoratorSkeleton {
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
