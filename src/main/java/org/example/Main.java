package org.example;

import org.example.control.CarController;
import org.example.model.components.Battery;

public class Main {
    public static void main(String[] args)
    {
        Battery battery = new Battery(12);

        System.out.println(CarController.createExample().toJSON());

        System.out.println("Hello world!");
    }
}