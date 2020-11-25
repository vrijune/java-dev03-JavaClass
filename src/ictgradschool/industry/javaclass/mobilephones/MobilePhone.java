package ictgradschool.industry.javaclass.mobilephones;

import java.security.PublicKey;

public class MobilePhone {

    // TODO Declare the 3 instance variables:
    // brand
    // model
    // price
    private String brand;
    private String model;
    private double price;


    public MobilePhone(String brand, String model, double price) {
        // Complete this constructor method
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // TODO Uncomment these methods once the corresponding instance variable has been declared.
    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    // TODO Insert getModel() method here
    public String getModel(){
        return model;
    }
    // TODO Insert setModel() method here
    public void setModel(String model) {
        this.model = model;
    }

    // TODO Insert getPrice() method here
    public double getPrice(){
        return price;
    }
    // TODO Insert setPrice() method here
    public void setPrice(double price) {
        this.price = price;
    }

    // TODO Insert toString() method here
        public String toString() {
            {return brand + " " + model + " which cost $" + price;
            }
        }
    // TODO Insert isCheaperThan() method here
    public boolean isCheaperThan(MobilePhone other){
        return this.price < other.getPrice();
    }


    // TODO Insert equals() method here
    public boolean equals(Object obj){
        if (obj instanceof MobilePhone){
            MobilePhone other =  (MobilePhone) obj;
            return brand.equals(other.brand) && model.equals(other.model) && Math.abs(price - other.price) < 1e-12;
        }
        return false;

    }

}


