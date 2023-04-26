package org.example.model.components;

import org.example.util.Side;

public class Tire
{
    // Attributes
    private double tire_pressure;

    private final Side side;

    private final int position;

    public Tire(double tire_pressure, Side side, int position)
    {
        this.tire_pressure = tire_pressure;
        this.side = side;
        this.position = position;
    }

    // Setter
    public void setTire_pressure(double tire_pressure)
    {
        this.tire_pressure = tire_pressure;
    }

    // Getter
    public double getTire_pressure()
    {
        return this.tire_pressure;
    }

    public Side getSide()
    {
        return this.side;
    }

    public int getPosition()
    {
        return this.position;
    }
}
