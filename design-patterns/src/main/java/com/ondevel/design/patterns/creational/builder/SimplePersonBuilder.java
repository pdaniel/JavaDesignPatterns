package com.ondevel.design.patterns.creational.builder;

/**
 * @author : Daniel
 * This is a builder using static inner class. It is a more simple way to build an object than standard builder pattern
 */
public class SimplePersonBuilder {
    String firstName;
    String lastName;
    int age;
    Address address;

    public SimplePersonBuilder(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.address = builder.address;
    }

    public static class Builder{
        String firstName;
        String lastName;
        int age;
        Address address;
        public Builder withFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder withAge(int age){
            this.age = age;
            return this;
        }

        public Builder withAddress(Address address) {
            this.address = address;
            return this;
        }

      public SimplePersonBuilder build(){
          return new SimplePersonBuilder(this);
      }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }
}
