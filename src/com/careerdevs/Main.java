package com.careerdevs;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        Car myCar = new Car("Black", "Volvo", "123", 1995);
        System.out.println(myCar);
        System.out.println(myCar.toString());
        myCar.displayDetails();
    }
}
