package org.example;

public class Address {
    private int zipCode;
    private String country;
    private String city;

    public Address(int zipCode, String country, String city) {
        this.zipCode = zipCode;
        this.country = country;
        this.city = city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "zipCode=" + zipCode +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
