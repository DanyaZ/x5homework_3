public class Aspirant extends Student {
    String scientificWork;

    public Aspirant(double averageMark) {
        super(averageMark);
    }

    @Override
    public int getScholarship() {
        int money;
        if (averageMark == 5) {
            money = 200;
        } else {
            money = 180;
        }
        return money;
    }
}
