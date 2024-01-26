package generic;

public class Person implements Comparable<Person> {

    private String name;
    private String address;

    public Person(java.lang.String name, java.lang.String address) {
        this.name = name;
        this.address = address;
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public java.lang.String getAddress() {
        return address;
    }

    public void setAddress(java.lang.String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public int compareTo(Person o){
        return this.name.compareTo(o.name);
    }
}
