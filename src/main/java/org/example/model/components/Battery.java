package org.example.model.components;

public class Battery
{
    private double voltage;

    public Battery(double voltage)
    {
        this.voltage = voltage;
    }

    public double getVoltage()
    {
        return this.voltage;
    }

    public void setVoltage(double voltage)
    {
        this.voltage = voltage;
    }
}
