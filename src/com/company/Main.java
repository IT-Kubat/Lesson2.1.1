package com.company;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setName("Bobik");
        dog.setBreed("Taygan");
        Shelter shelter = new Shelter("Dog", "Chyngyz Aytmatov.29");
        dog.setShelter(shelter);
        dog.setColor(Color.BROWN);
        dog.setCommands(new String[]{"Fas", "Stoyat'", "Sidet'"});
        dog.makeVoice();
        System.out.println(dog.getInfo());

        Dog d2 = new Dog( "Tuzik", "Ovcharka", Color.GRAY, new Shelter("Charli", "Tynystanov,123"));
        d2.setCommands(new String[]{"Lezhat'", "Begom"});
        d2.makeVoice("Avavav");
        System.out.println(d2.getInfo());

        Dog d3 = new Dog("Rex", "Haski", new String[]{"Ko mne", "Day lapu"}, Color.WHITE, new Shelter("Kendi", "Sovetskaya,130"));
        d3.makeVoice("Gaaav", 5);
        System.out.println(d3.getInfo());

        // write your code here
    }
}
