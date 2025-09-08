package DesignPattern.DecoratorDesignPattern.Decorator;

import DesignPattern.DecoratorDesignPattern.Coffee;

public class CoffeeDecoratorSkeleton implements Coffee {
    protected Coffee coffee;
    public CoffeeDecoratorSkeleton(Coffee coffee) {
        this.coffee = coffee;
    }
    @Override
    public String getDescription() {
        return coffee.getDescription();
    }
    @Override
    public double cost() {
        return coffee.cost();
    }
}
