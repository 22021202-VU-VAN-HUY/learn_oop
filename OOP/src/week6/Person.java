package week6;

// code by HuyVu
public class Person {
    private String name;
    private String address;

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

    /**
     * constructor.
     *
     * @param name    name of person
     * @param address address of person
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person[" + "name=" + getName() + ",address=" + getAddress() + "]";
    }
}
