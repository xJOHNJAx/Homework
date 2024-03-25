package Homework2;

class AllSeasonWheel extends Wheel {
    public AllSeasonWheel(int radius, String name) {
        super(radius, name);
    }

    @Override
    public String getSeasonality() {
        return "All-Season";
    }
}
