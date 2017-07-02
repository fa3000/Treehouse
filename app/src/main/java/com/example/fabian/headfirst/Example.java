package com.example.fabian.headfirst;

/**
 * Created by fabian on 30.06.17.
 */
public class Example {
    public static void main (String[] args) {

        Dog[] dogs = new Dog[4];

       dogs[1]  = new Dog();
        dogs[2] = new Dog();
        dogs[3] = new Dog();

        dogs[1].name="Fabian";
        dogs[2].name="Dennis";
        dogs[3].name="Sven";
        dogs[1].age= 4;
        dogs[2].age=5;
        dogs[3].age=3;

        dogs[1].bark();
        System.out.println("Mein Name ist " +dogs[1].name+ ". Ich bin "+dogs[1].age+" Jahre alt.");
        dogs[2].bark();
        System.out.println("Mein Name ist " +dogs[2].name+ ". Ich bin "+dogs[2].age+" Jahre alt.");
        dogs[3].bark();
        System.out.println("Mein Name ist " +dogs[3].name+ ". Ich bin "+dogs[3].age+" Jahre alt.");
    }
}
