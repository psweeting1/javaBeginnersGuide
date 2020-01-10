package com.company;

public class Van implements IVehicleQ {
    String vehicle;
    int maxSpeed;
    String engineSize;
    String behaviour;
    String secretWeapon;
    int wheelNumber;

    public void vehicleType() {
        vehicle = "Van";
    }

    public void setVehicleType(String vehicle) {
        this.vehicle = vehicle;
    }

    public void maxSpeed () {
        maxSpeed = 120;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void engine() {
        engineSize = "Turbo 6.1";
    }

    public void setEngineSize(String engineSize) {
        this.engineSize = engineSize;
    }

    public void doBehaviour () {
        behaviour = "Whistle";
    }

    public void setBehaviour(String behaviour) {
        this.behaviour = behaviour;
    }

    public void secretWeapon () {
        secretWeapon = "Rollie Polly";
    }

    public void setSecretWeapon(String secretWeapon) {
        this.secretWeapon = secretWeapon;
    }

    public void wheelNumber() {
        wheelNumber = 5;
    }

    public void setWheelNumber(int wheelNumber) {
        this.wheelNumber = wheelNumber;
    }

    @Override
    public String toString() {
        return "I drive a " + vehicle + " " + "it's engine size is " + engineSize + " " + "my max speed is " + maxSpeed;
    }
}
