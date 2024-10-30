// src/main/java/com/example/Main.java
package com.example;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John Doe");
        Address address = new Address("123 Main St", "Springfield");
        person.setAddress(address);
        
        System.out.println(person.getName() + " lives at " + person.getAddress().getFullAddress());
    }
}

// src/main/java/com/example/Person.java
package com.example;

public class Person {
    private String name;
    private Address address;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}

// src/main/java/com/example/Address.java
package com.example;

public class Address {
    private String street;
    private String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public String getFullAddress() {
        return street + ", " + city;
    }
}
