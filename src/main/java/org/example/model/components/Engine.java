package org.example.model.components;

public class Engine
{
    private double engineRPS;

    private double temperatureEngineOil;

    private double temperatureCoolingFluid;

    private double fuelConsumptionLitresPer100km;

    public Engine(double engine_rps, double temperatureEngineOil, double temperatureCoolingFluid, double fuelConsumptionLitresPer100km)
    {
        this.engineRPS = engine_rps;
        this.temperatureEngineOil = temperatureEngineOil;
        this.temperatureCoolingFluid = temperatureCoolingFluid;
        this.fuelConsumptionLitresPer100km = fuelConsumptionLitresPer100km;
    }

    public double getEngine_rpm()
    {
        return this.engineRPS;
    }

    public void setEngine_rpm(double engine_rpm)
    {
        this.engineRPS = engine_rpm;
    }

    public double getTemperatureEngineOil()
    {
        return this.temperatureEngineOil;
    }

    public void setTemperatureEngineOil(double temperatureEngineOil)
    {
        this.temperatureEngineOil = temperatureEngineOil;
    }

    public double getTemperatureCoolingFluid()
    {
        return this.temperatureCoolingFluid;
    }

    public void setTemperatureCoolingFluid(double temperatureCoolingFluid)
    {
        this.temperatureCoolingFluid = temperatureCoolingFluid;
    }

    public double getFuelConsumptionLitresPer100km()
    {
        return this.fuelConsumptionLitresPer100km;
    }

    public void setFuelConsumptionLitresPer100km(double fuelConsumptionLitresPer100km)
    {
        this.fuelConsumptionLitresPer100km = fuelConsumptionLitresPer100km;
    }
}
