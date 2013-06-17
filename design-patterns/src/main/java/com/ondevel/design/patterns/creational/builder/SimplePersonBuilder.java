package com.ondevel.design.patterns.creational.builder;

/**
 * @author : Daniel
 * This is a builder using static inner class. It is a more simple way to build an object than standard builder pattern
 */
public class SimplePersonBuilder {
    String firstName;
    String lastName;
    int age;

    public SimplePersonBuilder(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
    }

    public static class Builder{
        String firstName;
        String lastName;
        int age;
        public Builder withFirstName(String firstName_){
            this.firstName = firstName_;
            return this;
        }

        public Builder withLastName(String lastName_){
            this.lastName = lastName_;
            return this;
        }

        public Builder withAge(int age_){
            this.age = age_;
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
}
