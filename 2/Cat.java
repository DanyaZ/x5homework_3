public class Cat extends Animal {
    String type_cat;

    public Cat(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("бегает ночью");
    }

    @Override
    public void eat() {
        System.out.println("ест мало");
    }

    @Override
    public void sleep() {
        System.out.println("спит много");
    }
}
