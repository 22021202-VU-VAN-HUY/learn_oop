
public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    public MotorBike(String brand, String model,
                     String registrationNumber, Person owner, boolean hasSidecar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSidecar;
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    /**
     * Retrieves information.
     *
     * @return Information about motorbike.
     */
    @Override
    public String getInfo() {
        return "Motor Bike:\n\tBrand: " + getBrand() + "\n\tModel: " + getModel()
                + "\n\tRegistration Number: " + getRegistrationNumber()
                + "\n\tHas Side Car: " + isHasSidecar() + "\n\tBelongs to "
                + getOwner().getName() + " - " + getOwner().getAddress();
    }
}
