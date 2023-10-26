package ktra1;

import ktra1.Person;
import ktra1.Vehicle;

public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    /**
     * .
     *
     * @param brand        .
     * @param model        .
     * @param registration .
     * @param owner        .
     * @param hasSidecar   .
     */
    public MotorBike(String brand, String model, String registration, Person owner,
                     boolean hasSidecar) {
        super(brand, model, registration, owner);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String getInfo() {
        return "Motor Bike:\n"
                + "\tBrand: " + super.getBrand() + "\n"
                + "\tModel: " + super.getModel() + "\n"
                + "\tRegistration Number: " + super.getRegistrationNumber() + "\n"
                + "\tHas Side Car: " + this.hasSidecar + "\n"
                + "\tBelongs to " + super.getOwner().getName() + " - "
                + super.getOwner().getAddress();
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}
