package addresses;

public class Persons {
    public String name;
    public  Address address;

    public Persons(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}
