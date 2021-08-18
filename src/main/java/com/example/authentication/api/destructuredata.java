package com.example.authentication.api;

import com.example.authentication.api.address;

import javax.persistence.*;

@Entity
@Table(name = "userdataa")
public class destructuredata {
    @Id
    private long id;
    @Column(name = "name")
    static private String name;
    static private int age;
    @Column(name = "address")
    static private address userAddress;

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
