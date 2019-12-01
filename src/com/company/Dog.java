package com.company;

import java.util.Arrays;

public class Dog extends Pet {
    private String name;
    private String breed;
    private String[] commands;
    public Dog(){}

    public Dog(String name, String breed, Color color, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        this.setColor(color);
        this.setShelter(shelter);

    }

    public Dog(String name, String breed, String[] commands, Color color, Shelter shelter) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
        this.setColor(color);
        this.setShelter(shelter);
    }

    public void makeVoice(){
        System.out.println("Gav Gav" + "AVAV");
    }
    public void makeVoice(String voice){
        System.out.println(voice);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }

    public void makeVoice(String voice, int number) {
        for (int i = 0; i <number; i++) {
            System.out.println(voice);

        }

    }
    public String getInfo(){
        return getName()+ "  " + getBreed() + "  " + Arrays.toString(getCommands()) + " " + super.getInfo();
    }

}
