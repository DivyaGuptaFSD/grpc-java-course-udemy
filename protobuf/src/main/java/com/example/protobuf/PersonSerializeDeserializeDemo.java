package com.example.protobuf;

import com.example.models.Person;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PersonSerializeDeserializeDemo {

    public static void main(String[] args) throws IOException {
       Person p1 = Person.newBuilder()
                .setName("Ganesh")
                .setAge(25)
                .build();

       //Create a path where you want to create the info
        Path path = Paths.get("file.ser");

        //Writing the instance as a byteArray using toByteArray() method.
        //write() method will throw IOException
        Files.write(path,p1.toByteArray());

        //Get the byteArray from the file
        byte[] bytes =Files.readAllBytes(path);

        //convert the byteArray into person instance.
        Person newPerson = Person.parseFrom(bytes);

        System.out.println(newPerson);

    }
}
