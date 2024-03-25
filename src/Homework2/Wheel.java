package Homework2;

abstract class Wheel {
    private int radius;
    private String name;

    public Wheel(int radius, String name) {
        this.radius = radius;
        this.name = name;
    }

    public int getRadius() {
        return radius;
    }

    public String getName() {
        return name;
    }

    public abstract String getSeasonality();

    @Override
    public String toString() {
        return "Wheel{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                '}';
    }
}
