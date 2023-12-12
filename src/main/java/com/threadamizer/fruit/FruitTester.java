/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.threadamizer.fruit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Clarke S.
 */
public class FruitTester {
    public static void main(String[] args) {
        FruitHelper fruitHelper = new FruitHelper() ;
        List<Fruit> fruits = new ArrayList<>();
        
        fruits.add(new Orange()); // Allowed, as Apple is a Fruit
        fruits.add(new Bannana()); // Allowed, as Banana is a Fruit
        fruitHelper.addOrange(fruits); // Allowed, as "Fruit super Apple"
        fruitHelper.eatAll(fruits); // Allowed
        
        Collection<Bannana> bananas = new ArrayList<>();
        bananas.add(new Bannana()); // Allowed
    //    fruitHelper.addOrange(bananas); // Compile error: may only contain Orange!
        fruitHelper.eatAll(bananas); // Allowed, as all Bananas are Fruits

    }
}

class FruitHelper {
    public void eatAll(Collection<? extends Fruit> fruits) {}
    public void addOrange(Collection<? super Orange> apples) {}
}

interface Fruit{
    public void sweetness();
}

class Bannana implements Fruit{

    public Bannana() {}
    
    @Override
    public void sweetness(){
        System.out.println("Bannana - 5");
    }
}

class Orange implements Fruit{

    public Orange() {
    }
    
    @Override
    public void sweetness(){
        System.out.println("Orange - 7");
    }
}

class SuperOrange extends Orange{

    public SuperOrange() {
    }
    
    @Override
    public void sweetness(){
        System.out.println("SuperOrange - 10");
    }    
}