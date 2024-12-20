package animalFood;

public class MyFirstAnimal {
    public static void main(String[] args) {
        Animal myAnimal = new Animal("BullTomas", 4, 107.7);

        myAnimal.calculateFoodRequirement();
        myAnimal.celebrateBirthday();
        myAnimal.calculateFoodRequirement1();
    }
}
