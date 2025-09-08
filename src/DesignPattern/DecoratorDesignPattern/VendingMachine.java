package DesignPattern.DecoratorDesignPattern;

import DesignPattern.DecoratorDesignPattern.Decorator.MilkDecorator;
import DesignPattern.DecoratorDesignPattern.Decorator.SugarDecorator;

public class VendingMachine {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription()+" Rs."+coffee.cost());
        
        // extras
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription()+" Rs. "+coffee.cost());

        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription()+" Rs. "+coffee.cost());
    }
}
