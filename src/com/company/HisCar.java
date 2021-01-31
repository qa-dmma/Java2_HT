package com.company;

public class HisCar implements CarInterface {
    String Gas;
    int Brake;
    String Description;

    @Override
    public void Gas() {
        System.out.println(Gas);
    }

    @Override
    public void Brake() {
        System.out.println(Brake);

    }

    @Override
    public void Description() {
        System.out.println(Description);

    }
}
