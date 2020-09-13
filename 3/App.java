public class App {
    public static void main(String[] args) {
        Aspirant x5Aspirant = new Aspirant(4.0);
        Student x5Student = x5Aspirant;

        Student[] elms = {new Student(5.0), new Aspirant(4.0)};

        for (Student elm : elms) {
            System.out.println(elm.getScholarship());

        }

    }
}
