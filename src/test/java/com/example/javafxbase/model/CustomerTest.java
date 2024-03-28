package com.example.javafxbase.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    Customer customer;

    String testName = "Pietje";
    String testAddress = "Heidelberglaan 15";
    String testCity = "Uuuutrecht";

    @BeforeEach
    void setUp() {
        customer = new Customer(testName, testAddress, testCity);
    }

    @Test
    void getName() { assertEquals(customer.getName(), testName); }

    @Test
    void getAddress() { assertEquals(customer.getAddress(), testAddress); }

    @Test
    void getCity() { assertEquals(customer.getCity(), testCity); }

    @Test
    void setName() {
        String newName = "Jantje";
        customer.setName(newName);
        assertEquals(customer.getName(), newName);
    }

    @Test
    void setAddress() {
        String newAddress = "Padualaan 99";
        customer.setAddress(newAddress);
        assertEquals(customer.getAddress(), newAddress);
    }

    @Test
    void setCity() {
        String newCity = "Amsterdam";
        customer.setCity(newCity);
        assertEquals(customer.getCity(), newCity);
    }
}