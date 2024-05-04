public class Motobike extends Vehicle {

    public Motobike(String brand, String model, int year, double price, int number) {
        super(brand, model, year, price, number);
    }


    @Override
    double calculateResaleValue() {
        return getPrice() + getPrice() * 0.35;
    }

    @Override
    void displayInfo() {
        System.out.println(
                "Tên hãng: " + brand + "Dòng xe Moto: " + model + "Năm sản xuất" + year + "Giá: "
                        + price + "Số lượng hàng trong kho :" + number);

    }

}
