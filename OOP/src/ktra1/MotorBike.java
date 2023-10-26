package ktra1;

public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    /**
     * .
     *
     * @param brand        .
     * @param model        .
     * @param registrationNumber .
     * @param owner        .
     * @param hasSidecar   .
     */
    public MotorBike(String brand, String model, String registrationNumber, Person owner,
                     boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }

    /**
     * .
     * @return .
     */
    @Override
    public String getInfo() {
        return "Motor Bike:\n"
                + "\tBrand: " + super.getBrand() + "\n"
                + "\tModel: " + super.getModel() + "\n"
                + "\tRegistration Number: " + super.getRegistrationNumber() + "\n"
                + "\tHas Side ktra1.Car: " + this.hasSidecar + "\n"
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
