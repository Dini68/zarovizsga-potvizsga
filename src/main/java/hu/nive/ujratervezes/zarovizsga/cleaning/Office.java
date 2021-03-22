package hu.nive.ujratervezes.zarovizsga.cleaning;

public class Office implements Cleanable{

    private String address;
    private int area;
    private int level;

    public Office(String address, int area, int level) {
        this.address = address;
        this.area = area;
        this.level = level;
    }

    public int getArea() {
        return area;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public int clean() {
        return 100 * area * level;
    }

    @Override
    public String getAddress() {
        return address;
    }
}
