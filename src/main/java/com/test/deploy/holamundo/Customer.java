package com.test.deploy.holamundo;

public class Customer {
    private String lastName;
    private String firstName;
    private String key;

    public Customer(String lastName, String firstName, String key) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.key = key;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
