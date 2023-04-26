package org.example.model.components;

public class Transmission
{
    private double temperatureTransmissionOil;

    private int currentGear;

    public Transmission(double temperatureTransmissionOil, int currentGear)
    {
        this.temperatureTransmissionOil = temperatureTransmissionOil;
        this.currentGear = currentGear;
    }

    public double getTemperatureTransmissionOil()
    {
        return this.temperatureTransmissionOil;
    }

    public void setTemperatureTransmissionOil(double temperatureTransmissionOil)
    {
        this.temperatureTransmissionOil = temperatureTransmissionOil;
    }

    public int getCurrentGear()
    {
        return this.currentGear;
    }

    public void setCurrentGear(int currentGear)
    {
        this.currentGear = currentGear;
    }
}
