package addresses;

import java.util.ArrayList;

public class Address {
    private String street;
    private int house;

    public Address(String street, int house) {
        this.street = street;
        this.house = house;
    }

    public String getStreet() {
        return street;
    }

    public int getHouse() {
        return house;
    }


    @Override
    public String toString() {
        return "A{" +
                "s='" + street + '\'' +
                ", h='" + house + '\'' +
                '}';
    }

}
