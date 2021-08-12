package com.example.authentication.controllers;

import com.example.authentication.api.destructuredata;
import com.example.authentication.api.address;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class createuser {

    @PostMapping("/user/create")
    public static void createUser(@RequestBody String abc){
        System.out.println(abc);
        ObjectMapper mappedObject = new ObjectMapper();
        try {
            destructuredata data = mappedObject.readValue(abc, destructuredata.class);
            System.out.println(data.getAge());
            System.out.println(data.getUserAddress().getFlat());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @GetMapping("/user/address")
    public static String getUserAddress(){
        return new address().getStreet();
    }
}
