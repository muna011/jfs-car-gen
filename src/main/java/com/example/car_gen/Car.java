package com.example.car_gen;

public class Car {
    private String color;
    private int year;
    private int speed = 0;
    private int maxSpeed;
    private boolean isElectric;

    public Car(String color, int year, int maxSpeed) {
        this.color = color;
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.speed = 50;
        this.isElectric = false;

    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public int getSpeed() {
        return speed;
    }

    public int maxSpeed() {
        return maxSpeed;
    }

    public boolean getIsElectric() {
        return isElectric;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear (int year) {
        this.year = year;
    }

    public void setSpeed (int speed) {
        this.speed = speed;
    }

    public void setMaxSpeed (int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setIsElectric (boolean isElectric) {
        this.isElectric = isElectric;
    }

    public int accelerateSpeed() {
        if(speed + 5 <= maxSpeed) {
            speed += 5;
        }
        return speed;
    }

    public int decelerateSpeed() {
        if(speed - 5 >= 0) {
            speed -= 5;
        }
        return speed;
    }

    public boolean convertToElectric() {
        if (isElectric == false) {
            isElectric = true;
        } else {
            System.out.println("You're already electric! Yay!");
        }
        return isElectric;
    }

}
