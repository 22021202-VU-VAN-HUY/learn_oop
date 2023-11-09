package week6;

public class Student extends Person {

    private String program;
    private int year;
    private double fee;

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    /**
     * constructor.
     *
     * @param name    name of student
     * @param address address of student
     * @param program program of student
     * @param year    birthday of student
     * @param fee     fee of student
     */
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student[" + "ktra1.week11.Person[" + "name=" + getName() + ",address=" + getAddress() + "]"
                + ",program=" + getProgram() + ",year=" + getYear()
                + ",fee=" + getFee() + "]";
    }
}
