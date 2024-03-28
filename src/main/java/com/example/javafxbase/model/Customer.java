package com.example.javafxbase.model;

public class Customer {

    String name;
    String address;
    String city;

    public Customer(String nm, String addr, String ct) {
        name = nm;
        address = addr;
        city = ct;
    }

    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getCity() { return city; }

    public void setName(String nm) { name = nm; }
    public void setAddress(String addr) { address = addr; }
    public void setCity(String ct) { city = ct; }
}
