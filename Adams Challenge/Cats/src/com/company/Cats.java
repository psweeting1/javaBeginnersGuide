package com.company;

public class Cats {
    String firstName;
    String lastName;
    int legs;
    int eyes;
    int tails;
    String superPower;
    String talent;

    public Cats(String firstName, String lastName, int legs, int eyes, int tails, String superPower, String talent) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.legs = legs;
        this.eyes = eyes;
        this.tails = tails;
        this.superPower = superPower;
        this.talent = talent;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public int getTails() {
        return tails;
    }

    public void setTails(int tails) {
        this.tails = tails;
    }

    public String getSuperPower() {
        return superPower;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }

    public String getTalent() {
        return talent;
    }

    public void setTalent(String talent) {
        this.talent = talent;
    }

    public String toString () {
       return "My name is " + getFirstName() + " " + getLastName() + " and I have " + getLegs() + " legs and " + getEyes() + " Eyes, my Power is " + getSuperPower() + " and my talent is " + getTalent();
    };
}
