package org.example.model;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.example.model.components.*;
import org.example.util.LightMode;
import org.example.util.SerializableJSON;

public class Car implements SerializableJSON
{
    private double velocity;
    private double acceleration;
    private double mileage;
    private GPS gps;
    private Battery battery;
    private Engine engine;
    private SteeringWheel steeringWheel;
    private FuelTank fuelTank;
    private Tire[] tire;
    private Transmission transmission;
    private LightMode lightMode = LightMode.OFF;

    public Car(double velocity, double acceleration, double mileage, GPS gps, Battery battery, Engine engine, SteeringWheel steeringWheel, FuelTank fuelTank, Tire[] tire, Transmission transmission, LightMode lightMode)
    {
        this.velocity = velocity;
        this.acceleration = acceleration;
        this.mileage = mileage;
        this.gps = gps;
        this.battery = battery;
        this.engine = engine;
        this.steeringWheel = steeringWheel;
        this.fuelTank = fuelTank;
        this.tire = tire;
        this.transmission = transmission;
        this.lightMode = lightMode;
    }

    public double getVelocity()
    {
        return velocity;
    }

    public double getAcceleration()
    {
        return acceleration;
    }

    public double getMileage()
    {
        return mileage;
    }

    public GPS getGps()
    {
        return gps;
    }

    public Battery getBattery()
    {
        return battery;
    }

    public Engine getEngine()
    {
        return engine;
    }

    public SteeringWheel getSteeringWheel()
    {
        return steeringWheel;
    }

    public FuelTank getFuelTank()
    {
        return fuelTank;
    }

    public Tire[] getTire()
    {
        return tire;
    }

    public Transmission getTransmission()
    {
        return transmission;
    }

    public LightMode getLightMode()
    {
        return lightMode;
    }

    public void setVelocity(double velocity)
    {
        this.velocity = velocity;
    }

    public void setAcceleration(double acceleration)
    {
        this.acceleration = acceleration;
    }

    public void setMileage(double mileage)
    {
        this.mileage = mileage;
    }

    public void setLightMode(LightMode lightMode)
    {
        this.lightMode = lightMode;
    }

}
