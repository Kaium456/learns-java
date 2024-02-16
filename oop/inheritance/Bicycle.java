package oop.inheritance;

public class Bicycle {

    public int cadence;
    public int gear;
    public int speed;

    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public void setGear(int newValue) {
        cadence = newValue;
    }

    public void applyBreak(int decrement) {
        speed += decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

}