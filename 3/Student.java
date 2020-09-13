public class Student {
    String firstName;
    String lastName;
    String group;
    double averageMark;

    public Student(double averageMark) {
        this.averageMark = averageMark;
    }

    public int getScholarship() {
        int money;
        if (averageMark == 5) {
            money = 100;
        } else {
            money = 80;
        }
        return money;
    }
}
