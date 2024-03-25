package Homework2;

class WinterWheel extends Wheel {
    public WinterWheel(int radius, String name) {
        super(radius, name);
    }

    @Override
    public String getSeasonality() {
        return "Winter";
    }
}