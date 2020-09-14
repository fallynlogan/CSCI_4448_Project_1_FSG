package com.zoo;

//File for Hippo extending 
public class Hippo extends Pachyderm{
    public Hippo(String name)
    {
        super(name);
    }
    public void makeNoise() {
        System.out.print(this.getName() + "*Splashes Around*");
    }
}