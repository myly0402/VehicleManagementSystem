import java.util.ArrayList;
import java.util.List;

public class InventoryManager {

    List<Vehicle> vehicles = new ArrayList<>();

    public List<Vehicle> addVehicles(Vehicle vehicle) {
        vehicles.add(vehicle);
        return vehicles;

    }

    public void removeVehicle(String removeKey) {
        List<Vehicle> result = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getModel().contains(removeKey) || vehicle.getBrand().contains(removeKey)) {
                result.add(vehicle);

            }

        }
        if (result.size() == 0) {

            System.out.println("Không có sản phẩn nào cần xóa.");

        } else {

            System.out.println(" Các sản phẩm sẽ xóa khỏi kho hàng: ");
            displaySmallList(result);
            vehicles.removeAll(result);
            System.out.println("Hoàn tất xóa sản phẩm.");
            

        }

    }

    public void displaySmallList(List<Vehicle> smallList) {
        for (Vehicle vehicle : smallList) {
            vehicle.displayInfo();
        }

    }

    public void displayInventory() {
        int count = 1;
        for (Vehicle vehicle : vehicles) {
            System.out.print(count + ".");
            vehicle.displayInfo();
            count++;
        }
    }

    // public List<Vehicle> searchByBrand(String searchKey) {

    // List<Vehicle> result = new ArrayList<>();

    // for (Vehicle vehicle : vehicles) {
    // if (vehicle.getBrand().equals(searchKey)) {
    // result.add(vehicle);
    // }
    // }
    // return result;

    // }

    public List<Vehicle> searchVehicle(String searchKey) {

        List<Vehicle> result = new ArrayList<>();

        for (Vehicle vehicle : vehicles) {
            if (vehicle.getModel().equals(searchKey)) {
                result.add(vehicle);
            } else if (vehicle.getBrand().equals(searchKey)) {
                result.add(vehicle);
            }
        }
        return result;

    }

}
