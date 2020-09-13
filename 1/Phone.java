public class Phone {
    String number;
    String model;
    int weight;

    public Phone() {

    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " " + number);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
