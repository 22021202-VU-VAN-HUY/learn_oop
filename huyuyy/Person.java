import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String address;
    List<Vehicle> vehicleList;

    /**
     * Constructor.
     *
     * @param name    of person.
     * @param address of person.
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
        this.vehicleList = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Adds a vehicle.
     *
     * @param vehicle to add.
     */
    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    /**
     * Removes vehicle.
     *
     * @param registrationNumber number.
     */
    public void removeVehicle(String registrationNumber) {
        for (int tmp = 0; tmp < vehicleList.size(); tmp++) {
            if (vehicleList.get(tmp).getRegistrationNumber() == registrationNumber) {
                vehicleList.remove(tmp);
                break;
            }
        }
    }

    /**
     * Retrieves vehicles.
     *
     * @return string vehicles.
     */
    public String getVehiclesInfo() {
        if (vehicleList.isEmpty()) {
            return this.getName() + " has no vehicle!";
        }

        StringBuilder s1 = new StringBuilder(this.getName() + " has:\n");
        for (Vehicle vehicle : vehicleList) {
            s1.append("\n").append(vehicle.getInfo());
        }
        return s1.toString();
    }
}
