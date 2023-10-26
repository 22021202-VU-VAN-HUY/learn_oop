package ktra1;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String address;
    List<Vehicle> vehicleList;

    /**
     * .
     *
     * @param name    .
     * @param address .
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
        vehicleList = new ArrayList<Vehicle>();
    }

    /**
     * .
     *
     * @param vehicle .
     */
    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    /**
     * .
     *
     * @param registrationNumber .
     */
    public void removeVehicle(String registrationNumber) {
        for (Vehicle temp : vehicleList) {
            if (temp.getRegistrationNumber().equals((registrationNumber))) {
                vehicleList.remove(temp);
            }
        }
    }

    /**
     * .
     *
     * @return .
     */
    public String getVehiclesInfo() {
        String temp = "";
        if (vehicleList.isEmpty()) {
            return name + " has no vehicle!";
        } else {
            temp = name + " has:\n\n";
            for (Vehicle ve : vehicleList) {
                temp += getVehiclesInfo();
                temp += "\n";
            }
        }
        return temp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
