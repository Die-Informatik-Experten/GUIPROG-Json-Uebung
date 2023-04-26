package org.example.model.components;

public class GPS
{
    private double longitude;

    private double latitude;

    public GPS(double longitude, double latitude)
    {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public double getLongitude()
    {
        return this.longitude;
    }

    public void setLongitude(double longitude)
    {
        this.longitude = longitude;
    }

    public double getLatitude()
    {
        return this.latitude;
    }

    public void setLatitude(double latitude)
    {
        this.latitude = latitude;
    }
}
