package DesignPattern.DecoratorDesignPattern.Decorator;

import DesignPattern.DecoratorDesignPattern.Coffee;

public class SugarDecorator extends CoffeeDecoratorSkeleton {
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
