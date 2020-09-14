package com.zoo;

//Note: Canine extends Animal class
/* Wolf Class
*/
public class Wolf extends Canine{
    public Wolf(String name)
    {
        super(name);
    }
    public void makeNoise() {
        System.out.print(this.getName() + " BARKS!");
    }
}