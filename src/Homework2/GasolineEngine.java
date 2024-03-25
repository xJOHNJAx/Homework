package Homework2;

class GasolineEngine implements Engine {
    private double volume;
    private String fuelType;
    private String name;

    public GasolineEngine(double volume, String fuelType, String name) {
        this.volume = volume;
        this.fuelType = fuelType;
        this.name = name;
    }

    @Override
    public double getVolume() {
        return volume;
    }

    @Override
    public String getFuelType() {
        return fuelType;
    }

    @Override
    public String getName() {
        return name;
    }
}