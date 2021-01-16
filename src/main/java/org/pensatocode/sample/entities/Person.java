package org.pensatocode.sample.entities;

public class Person {
    private final String message = "Hello";
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public String getName() {
        return name;
    }
}
