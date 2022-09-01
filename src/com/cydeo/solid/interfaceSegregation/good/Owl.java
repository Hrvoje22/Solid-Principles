package com.cydeo.solid.interfaceSegregation.good;

public class Owl implements CanWalk,CanFly,CanEat{

    @Override
    public void eat() {
        System.out.println("Eating");
    }

    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void walk() {
        System.out.println("Walking");
    }
}
