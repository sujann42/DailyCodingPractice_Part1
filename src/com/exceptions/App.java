package com.exceptions;

public class App {
    public static void main(String[] args) {
        Animal dog = null;
        try {
            dog = new Animal("I am a dog", -15);
        } catch (AgeAnimalException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(dog);
    }
}
