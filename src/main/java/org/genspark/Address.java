package org.genspark;

import org.springframework.stereotype.Component;

@Component
public class Address {

    private String city;
    private String state;
    private String country;
    private String zipcode;

    public Address(String city, String state, String country, String zipcode) {
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipcode = zipcode;
    }

    public Address() {
        this.city = "Seattle";
        this.state = "Washington";
        this.country = "United States";
        this.zipcode = "98101";
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }
}
