package org.example.control;

import org.example.model.Car;
import org.example.model.components.*;
import org.example.util.LightMode;
import org.example.util.Side;

public class CarController
{
    public static Car createExample()
    {
        GPS gps = new GPS(30,65);
        Battery battery = new Battery(24);
        Engine engine = new Engine(100,305,315,10.8);
        SteeringWheel steeringWheel = new SteeringWheel(Math.PI * 1.7);
        FuelTank fuelTank = new FuelTank(85);
        Tire[] tires = {
                new Tire(2300, Side.LEFT, 0),
                new Tire(2300, Side.RIGHT, 0),
                new Tire(2350, Side.LEFT, 1),
                new Tire(2350, Side.RIGHT, 1)
        };
        Transmission transmission = new Transmission(360,8);
        Car car = new Car(100,
                12,
                45000,
                gps,
                battery,
                engine,
                steeringWheel,
                fuelTank,
                tires,
                transmission,
                LightMode.HIGH_BEAM
                );

        return car;
    }
}
