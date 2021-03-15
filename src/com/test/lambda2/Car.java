package com.test.lambda2;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Car {
    String model;
    String color;
    double engine;

    Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    public String toString() {
        return "Our car is " + model + ", color is " + color + " and engine = " + engine;
    }
}

class Test10 {
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(carSupplier.get());
        }
        return list;
    }

    public static void changeCar(Car car, Consumer<Car> consumer) {
        consumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> ourCars = createThreeCars(() -> new Car("Nissan Tiida", "Silver", 1.6));
        System.out.println("ourCars" + ourCars);

        changeCar(ourCars.get(0), car -> {
            car.color = "red";
            car.engine = 3.0;
            car.model = "mercedes";
            System.out.println("Update car: " + car);
        });
        System.out.println("ourCars: "+ ourCars);
    }
}