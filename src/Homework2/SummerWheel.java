package Homework2;

class SummerWheel extends Wheel {
    public SummerWheel(int radius, String name) {
        super(radius, name);
    }

    @Override
    public String getSeasonality() {
        return "Summer";
    }
}