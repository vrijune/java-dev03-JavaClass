package ictgradschool.industry.javaclass.deodorant;

public class Deodorant {

    private String brand;
    private String fragrance;
    private boolean rollOn;
    private double price;

    public Deodorant(String brand, String fragrance,
                     boolean rollOn, double price) {

        this.brand = brand;
        this.fragrance = fragrance;
        this.rollOn = rollOn;
        this.price = price;
    }

    public String toString() {
        String info = brand + " " + fragrance;
        if (rollOn) {
            info = info + " Roll-On";
        } else {
            info = info + " Spray";
        }
        info +=  " Deodorant, \n$" + price;
        return info;
    }

    // TODO Implement all methods below this line.

    public double getPrice() {
        return 0;
    }

    public String getBrand() {
        return null;
    }

    public boolean isRollOn() {
        return false;
    }

    public String getFragrance() {
        return null;
    }

    public void setPrice(double price) {

    }

    public void setBrand(String brand) {

    }

    public void setFragrance(String fragrance) {

    }

    public boolean isMoreExpensiveThan(Deodorant other) {
        return false;
    }
}