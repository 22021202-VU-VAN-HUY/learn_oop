package week11;

public class Person implements Comparable {
    protected String name;
    protected int age;
    protected String address;

    /**
     * .
     */
    public Person() {

    }

    /**
     * .
     *
     * @param name    .
     * @param age     .
     * @param address .
     */
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Person) {
            Person p = (Person) o;
            if (name.equals(p.name)) {
                return Integer.compare(this.getAge(), p.getAge());
            }
            return this.getName().compareTo(p.getName());
        }
        return 0;
    }
}


