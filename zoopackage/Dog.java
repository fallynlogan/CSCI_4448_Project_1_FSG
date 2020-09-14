package com.zoo;

//Canine extends animal
public class Dog extends Canine{
    public Dog(String[] name)
    {
        super(name);
    }
    public void roam() {
        System.out.print(this.getName() + " bark ");
    }
}