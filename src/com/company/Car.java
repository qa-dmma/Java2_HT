package com.company;

abstract class Car {
    String Model;
    int Speed;
    String Color;

    void Gas (int a){
        System.out.println("Gas" + a);
    }
    void Brake (int a){
        System.out.print("Brake" + a);
    }
    abstract void Description ();
}
