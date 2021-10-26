package com.example.protobuf;

import com.example.models.Person;

public class PersonDemo {
    public static void main(String[] args) {

        Person p = Person.newBuilder()
                    .setName("Divya")
                    .setAge(26)
                    .build();

        System.out.println(p);
    }
}
