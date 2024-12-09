package oop2;

public class MyDogsFirst {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        
        myDog.setBreed("Овчарка");
        myDog.setNickname ("Fury");
        myDog.setPaws(4);
        myDog.setCoatСolor("чёрная");
        myDog.setWeight(12.7);
        
        myDog.breed();
        myDog.nickname();
        myDog.paws();
        myDog.coatСolor();
        myDog.weight();

    }
    
}
