package hu.nive.ujratervezes.zarovizsga.cleaning;

public class House implements Cleanable{

    private String address;
    private int area;

    public House(String address, int area) {
        this.address = address;
        this.area = area;
    }

    public int getArea() {
        return area;
    }

    @Override
    public int clean() {
        return 80 * area;
    }

    @Override
    public String getAddress() {
        return address;
    }
}
