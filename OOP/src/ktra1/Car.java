package ktra1;

class Car extends Vehicle {
    private int numberOfDoors;

    /**
     * .
     *
     * @param brand              .
     * @param model              .
     * @param registrationNumber .
     * @param owner              .
     * @param numberOfDoors      .
     */
    public Car(String brand, String model, String registrationNumber, Person owner,
               int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String getInfo() {
        return "Car:\n"
                + "\tBrand: " + super.getBrand() + "\n"
                + "\tModel: " + super.getModel() + "\n"
                + "\tRegistration Number: " + super.getRegistrationNumber() + "\n"
                + "\tNumber of Doors: " + this.numberOfDoors + "\n"
                + "\tBelongs to " + super.getOwner().getName() + " - "
                + super.getOwner().getAddress();
    }
}
