package com.cydeo.solid.interfaceSegregation.good;

import java.util.ArrayList;
import java.util.List;

public class MyApp {


    public static void main(String[] args) {

        List<CanFly> birds = new ArrayList<>();
        birds.add(new Eagle());
        birds.add(new Owl());
        //birds.add(new Chicken()); compiler says that chicken can not fly




    }

    public static void letBirdsFly(List<CanFly> birds){
        for (CanFly bird : birds){
            bird.fly();
        }
    }


}
