package com.example.authentication.api;

import com.example.authentication.api.address;

public class destructuredata {
    private String name;
    private int age;
    private address userAddress;

    public address getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(address userAddress) {
        this.userAddress = userAddress;
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

}
