import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        InventoryManager inventoryManager = new InventoryManager();
        Vehicle car = new Car("Toyota", "123", 2012, 2000000000, 4);
        Vehicle truck = new Truck("HuynhDai", "124", 2022, 1000000000, 5);
        Vehicle Moto = new Motobike("Honda", "124", 2022, 100000000, 5);

        inventoryManager.addVehicles(car);
        inventoryManager.addVehicles(Moto);
        inventoryManager.addVehicles(truck);
        System.out.println("Danh sách xe trong kho hiện tại: ");
        inventoryManager.displayInventory();

        int option;
        String vehicleType;
        boolean continueLoop = true;

        do {

            System.out.println("---Kho hàng---\n" +
                    "1. Thêm sản phẩm \n" +
                    "2. Hiển thị danh sách kho hàng \n" +
                    "3. Tìm kiếm sản phẩm\n" +
                    "4. Xóa sản phẩm\n" +
                    "5. Thoát\n");
            System.out.println("Nhập chức năng cần thực hiện:(1/2/3/4/5)");
            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:

                    String brand;
                    String model;
                    int year;
                    double price;
                    int number;

                    System.out.println("Nhập vào hãng xe");
                    brand = scanner.nextLine();
                    System.out.println("Nhập vào model: ");
                    model = scanner.nextLine();
                    System.out.println("Nhập vào năm sản xuất: ");
                    year = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhập vào giá ban đầu: ");
                    price = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Nhập vào số lượng xe: ");
                    number = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Sản phẩm vừa nhập thuộc danh mục nào (car/truck/moto)?");
                    vehicleType = scanner.nextLine();

                    switch (vehicleType) {
                        case "car":
                            Vehicle addedCar = new Car(brand, model, year, price, number);
                            inventoryManager.addVehicles(addedCar);
                            break;
                        case "truck":
                            Vehicle addedTruck = new Truck(brand, model, year, price, number);
                            inventoryManager.addVehicles(addedTruck);
                            break;

                        case "moto":
                            Vehicle addedMoto = new Motobike(brand, model, year, price, number);
                            inventoryManager.addVehicles(addedMoto);
                            break;

                        default:
                            break;
                    }

                    break;
                case 2:
                    inventoryManager.displayInventory();
                    break;

                case 3:
                    System.out.println("Nhập vào sản phẩm cần tìm kiếm: ");
                    String searchKey = scanner.nextLine();
                    List<Vehicle> searchResults = new ArrayList<>(inventoryManager.searchVehicle(searchKey));

                    if (searchResults.size() == 0) {
                        System.out.println("Không có sản phẩm phù hợp.");

                    } else {
                        System.out.println("Kết quả tìm kiếm:");
                        inventoryManager.displaySmallList(searchResults);

                    }
                    break;

                case 4:
                    System.out.println("Nhập tên hãng/dòng sản phẩm cần xóa:");
                    String removeKey = scanner.nextLine();
                    inventoryManager.removeVehicle(removeKey);
                    break;

                case 5:
                    System.out.println("Thoát chương trình.");
                    continueLoop = false;
                    break;

                default:
                    break;
            }

            scanner.close();

        } while (continueLoop);

      
    }


}
