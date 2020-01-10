package com.company;

public class Main {

    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.vehicleType();
        truck.wheelNumber();
        truck.secretWeapon();
        truck.engine();
        truck.maxSpeed();
        truck.doBehaviour();
        System.out.println(truck);

        Van van = new Van();
        van.vehicleType();
        van.wheelNumber();
        van.secretWeapon();
        van.engine();
        van.maxSpeed();
        van.doBehaviour();

        System.out.println(van);
    }
}
