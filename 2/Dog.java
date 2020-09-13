public class Dog extends Animal {

    String type_dog;

    public Dog(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("Лает");
    }

    @Override
    public void eat() {
        System.out.println("ест много");
    }

    @Override
    public void sleep() {
        System.out.println("храпит");
    }
}
