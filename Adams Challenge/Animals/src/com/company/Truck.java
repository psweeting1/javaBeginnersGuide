package com.company;

public class Truck implements IVehicleQ {

    String vehicle;
    int maxSpeed;
    String engineSize;
    String behaviour;
    String secretWeapon;
    int wheelNumber;

    public void vehicleType() {
        vehicle = "Big truck";
    }

    public void setVehicleType(String vehicle) {
        this.vehicle = vehicle;
    }

    public void maxSpeed () {
        maxSpeed = 160;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void engine() {
        engineSize = "Turbo";
    }

    public void setEngineSize(String engineSize) {
        this.engineSize = engineSize;
    }

    public void doBehaviour () {
        behaviour = "Fly";
    }

    public void setBehaviour(String behaviour) {
        this.behaviour = behaviour;
    }

    public void secretWeapon () {
        secretWeapon = "Side missiles";
    }

    public void setSecretWeapon(String secretWeapon) {
        this.secretWeapon = secretWeapon;
    }

    public void wheelNumber() {
        wheelNumber = 4;
    }

    public void setWheelNumber(int wheelNumber) {
        this.wheelNumber = wheelNumber;
    }

    @Override
    public String toString() {
        return "I drive a " + vehicle + " " + "it's engine size is " + engineSize + " " + "my max speed is " + maxSpeed;
    }
}
