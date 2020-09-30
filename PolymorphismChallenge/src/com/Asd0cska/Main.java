package com.Asd0cska;

class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine (){
        return "Car -> startEngine()";
    }

    public String accelerate () {
        return "Car -> accelerate()";
    }

    public String breakCar () {
        return "Car -> breakCar()";
    }
}

class Nissan extends Car{
    public Nissan(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine (){
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate () {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String breakCar () {
        return getClass().getSimpleName() + " -> breakCar()";
    }
}

class Toyota extends Car{
    public Toyota(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine (){
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate () {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String breakCar () {
        return getClass().getSimpleName() + " -> breakCar()";
    }
}

class Honda extends Car{
    public Honda(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine (){
        return getClass().getSimpleName() + " -> startEngine()";
    }

    @Override
    public String accelerate () {
        return getClass().getSimpleName() + " -> accelerate()";
    }

    @Override
    public String breakCar () {
        return getClass().getSimpleName() + " -> breakCar()";
    }
}

public class Main {

    public static void main(String[] args) {

        Car car = new Car(6,"Original car");

        System.out.println("Original class:");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.breakCar());
        System.out.println("---------------------------");

        Nissan nissan = new Nissan(8, "Nissan Skyline");

        System.out.println("Polymorphismed classes:");
        System.out.println(nissan.startEngine());
        System.out.println(nissan.accelerate());
        System.out.println(nissan.breakCar());
        System.out.println("---------------------------");

        Honda honda = new Honda(8, "Honda Civic");

        System.out.println(honda.startEngine());
        System.out.println(honda.accelerate());
        System.out.println(honda.breakCar());
        System.out.println("---------------------------");

        Toyota toyota = new Toyota(8, "Toyota Corolla");

        System.out.println(toyota.startEngine());
        System.out.println(toyota.accelerate());
        System.out.println(toyota.breakCar());
    }
}
