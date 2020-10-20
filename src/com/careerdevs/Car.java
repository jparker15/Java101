package com.careerdevs;

public class Car {

    private String color;
    private String model;
    private String vin;
    private int tireCount;
    private int year;
    private boolean isRunning = false;

    /*Declaration of method*/
    public Car(String color, String model, String vin, int tireCount, int year){
        //Definition of method
        this.color = color;
        this.model = model;
        this.vin = vin;
        this.tireCount = tireCount;
        this.year = year;
        isRunning = false;
    }

    public Car(String color, String model, String vin, int year){
        this.color = color;
        this.model = model;
        this.vin = vin;
        this.tireCount = 4;
        this.year = year;
        isRunning = false;
    }

    public void drive(){
        if (!isRunning){
            System.out.println("Turn vehicular on first");
            return;
        }
        System.out.println("Moving");
    }
    public void setRunning(boolean on){
        if (isRunning && on) {
            System.out.println("Screeeech");
            return;
        }
        if (!isRunning && !on){
            System.out.println("Radio starting");
            return;
        }
        isRunning = on;
    }

    public void toggleRunning() {
        isRunning = !isRunning;
        //setRunning(!isRunning);
    }

    public void displayDetails() {
        System.out.printf("You're driving a %s %s %s", color, year, model);
    }

    @Override
    public String toString(){
        return "You are driving a " + color + " " + year + " " + model + "." ;
    }
}
