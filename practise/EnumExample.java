package practise;

public class EnumExample {

    public enum Day {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY;
    }

    public void displayDay(Day day) {
        if (day == Day.FRIDAY) {
            System.out.println("It's Friday!! Weekend");
        } else if (day == Day.SATURDAY) {
            System.out.println("It's Saturdya!! Another Weekend");
        } else {
            System.out.println("Weekday");
        }
    }

    public static void main(String[] args) {
        EnumExample enumExample = new EnumExample();
        Day day = Day.MONDAY;
        enumExample.displayDay(day);
    }

}
