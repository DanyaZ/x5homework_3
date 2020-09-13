public class App {
    public static void main(String[] args) {
        Phone phone1 = new Phone("896346832", "mix", 150);
        Phone phone2 = new Phone("+79683154", "arm", 200);
        Phone phone3 = new Phone("896547892", "fix", 160);

        System.out.println("номер: " + phone1.number + " модель: " + phone1.model + " вес: " + phone1.weight);
        System.out.println("номер: " + phone2.number + " модель: " + phone2.model + " вес: " + phone2.weight);
        System.out.println("номер: " + phone3.number + " модель: " + phone3.model + " вес: " + phone3.weight);

        phone1.receiveCall("Daniil");
        System.out.println(phone1.getNumber());
        phone1.receiveCall("Daniil", "8956642182");
        phone1.sendMessage("85156468", "544646446");
    }
}
