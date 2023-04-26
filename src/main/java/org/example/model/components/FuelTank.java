package org.example.model.components;

public class FuelTank
{
    private double fuelLevel;

    public FuelTank(double fuelLevel)
    {
        this.fuelLevel = fuelLevel;
    }

    public double getFuelLevel()
    {
        return this.fuelLevel;
    }

    public void setFuelLevel(double fuelLevel)
    {
        this.fuelLevel = fuelLevel;
    }
}
