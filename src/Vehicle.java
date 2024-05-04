public abstract class Vehicle {

   protected String brand;
   protected String model;
   protected int year;
   protected double price;
   protected int number;

   
   


    public Vehicle(String brand, String model, int year, double price, int number) {
    this.brand = brand;
    this.model = model;
    this.year = year;
    this.price = price;
    this.number = number;
}



    public String getBrand() {
    return brand;
}

public void setBrand(String brand) {
    this.brand = brand;
}

public String getModel() {
    return model;
}

public void setModel(String model) {
    this.model = model;
}

public int getYear() {
    return year;
}

public void setYear(int year) {
    this.year = year;
}

public double getPrice() {
    return price;
}

public void setPrice(double price) {
    this.price = price;
}

public int getNumber() {
    return number;
}

public void setNumber(int number) {
    this.number = number;
}

    abstract void displayInfo();

    abstract double calculateResaleValue();

}
