public class Veterinarian {
    public static void main(String[] args) {
        Animal[] Animals = {new Dog("кость", "дом"), new Cat("рыба", "улица"), new Horse("сено", "хлев")};
        for (Animal animal : Animals) {
            treatAnimal(animal);
        }
    }

    public static void treatAnimal(Animal animal) {
        System.out.println(animal.food);
        System.out.println(animal.location);
    }
}
