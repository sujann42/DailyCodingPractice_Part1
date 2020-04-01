package com.exceptions;

public class Animal {
    private String name;
    private int age;

    //Parameterized Constructor
    public Animal(String name, int age) throws AgeAnimalException {
        if (age < 0 || age > 100) {
            throw new AgeAnimalException("An Animal can't have a negative or over 100 in age.");
        } else {
            this.name = name;
            this.age = age;
            System.out.println("You have created a dog!!!!");
        }
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void eat() {

    }

    public void makeSound() {

    }
}
