package com.example.protobuf;

import com.example.models.Person;

public class PersonDemo {
    public static void main(String[] args) {
        Person p1 = Person.newBuilder()
                    .setName("Divya")
                    .setAge(26)
                    .build();

        System.out.println("p1 object "+ p1);

        Person p2 = Person.newBuilder()
                .setName("divya")
                .setAge(26)
                .build();

        System.out.println("p2 object "+ p2);
        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}
