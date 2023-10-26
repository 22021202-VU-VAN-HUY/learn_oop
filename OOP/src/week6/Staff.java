package week6;

public class Staff extends Person {
    private String school;
    private double pay;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    /**
     * constructor 1.
     *
     * @param name    name of staff
     * @param address address of staff
     * @param school  school of staff
     * @param pay     pay of staff
     */
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff[" + "ktra1.Person[" + "name=" + getName() + ",address=" + getAddress() + "]"
                + ",school=" + getSchool() + ",pay=" + getPay() + "]";
    }
}
