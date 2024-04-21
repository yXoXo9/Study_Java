package lang.immutable.test;

public class ImmutableMyDateMain {

    public static void main(String[] args) {
        ImmutableMyDate date1 = new ImmutableMyDate(2024, 1, 1);
        ImmutableMyDate date2 = date1;
        System.out.println("Immutable_date1 = " + date1);
        System.out.println("Immutable_date2 = " + date2);

        System.out.println("2025 -> date1");
        // date2 = date1.setYear(2025);
        date1 = date1.withYear(2025);
        System.out.println("set_2025_date1 = " + date1);
        System.out.println("set_2025_date2 = " + date2);
    }

}
