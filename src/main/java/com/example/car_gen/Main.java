package com.example.car_gen;

public class Main {

    public static void main(String[] args) {
        Honda civic = new Honda("white", 2020, 200, true);
        Lexus rx350 = new Lexus("blue", 1999, 350, false);
        Toyota supra = new Toyota("green", 2006, 150, true);

//        System.out.println(civic.getColor());
//        System.out.println(rx350.accelerateSpeed());
//        supra.setSpeed(50);
//        System.out.println(supra.decelerateSpeed());
//        civic.setIsElectric(false);
//        civic.setIsElectric(true);
//        System.out.println(civic.convertToElectric());
//        rx350.setHasLeatherSeats(true);
          System.out.println(rx350.getHasLeatherSeats());

    }

}
