public class Truck extends Vehicle {
    private double resalePrice;

   

    public Truck(String brand, String model, int year, double price, int number) {
        super(brand, model, year, price, number);
        resalePrice = getPrice()+ getPrice()* 0.3;
    }

    @Override
    double calculateResaleValue() {
        
        return resalePrice;
    }

    @Override
    void displayInfo() {
        System.out.println(
                "Tên hãng: " + getBrand() + "Dòng xe tải: " +getModel() + "Năm sản xuất" + getYear() + "Giá: " + resalePrice + "Số lượng hàng trong kho :" + getNumber());
    }

    public double getResalePrice() {
        return resalePrice;
    }

    public void setResalePrice(double resalePrice) {
        this.resalePrice = resalePrice;
    }

}
