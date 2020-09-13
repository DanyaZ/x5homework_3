public class Horse extends Animal {
    String color;

    public Horse(String food, String location) {
        super(food, location);
    }

    @Override
    public void makeNoise() {
        System.out.println("стучит копытами");
    }

    @Override
    public void eat() {
        System.out.println("ест сено");
    }

    @Override
    public void sleep() {
        System.out.println("спит стоя");
    }
}
