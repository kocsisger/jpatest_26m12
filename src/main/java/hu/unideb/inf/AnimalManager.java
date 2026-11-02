package hu.unideb.inf;

public class AnimalManager {
    static AnimalDAO animalDAO;

    public static void setAnimalDAO(AnimalDAO animalDAO) {
        AnimalManager.animalDAO = animalDAO;
    }

    public static void manageAnimals(){
        Animal animal = new Animal("Dog", 4, Animal.GenderType.UNKNOWN);
        Animal animal2 = new Animal("Cat", 2, Animal.GenderType.MALE);

        animalDAO.saveAnimal(animal);
        animalDAO.saveAnimal(animal2);
    }
}
