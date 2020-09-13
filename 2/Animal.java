public class Animal {
    String food;
    String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("громко ходит");
    }

    public void eat() {
        System.out.println("ест");
    }

    public void sleep() {
        System.out.println("спит");
    }
}
