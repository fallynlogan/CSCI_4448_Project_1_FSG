package com.zoo;

public class Reptile extends Animal{
    public Reptile(String name)
    {
        super(name);
    }
    public void roam() {
        System.out.print(this.getName() + " slithers around.");
    }
}