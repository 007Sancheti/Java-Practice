package com.sancheti.collections;

public class Customer implements Comparable<Customer> {
    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    private String name;
    private String email;

    @Override
    public int compareTo(Customer o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
