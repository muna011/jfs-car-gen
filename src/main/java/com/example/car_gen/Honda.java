package com.example.car_gen;

public class Honda extends Car {
    private boolean isTurboCharged;

    public Honda(String color, int year, int maxSpeed, boolean isTurboCharged) {
        super(color, year, maxSpeed);

    }

    public boolean getIsTurboCharged(){
        return this.isTurboCharged;
    }

    public void setTurboCharged(boolean isTurboCharged) {
        this.isTurboCharged = isTurboCharged;
    }

}
