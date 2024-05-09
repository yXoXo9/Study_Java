package time;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitMain_10 {
    public static void main(String[] args) {
        ChronoUnit[] values = ChronoUnit.values();
        for (ChronoUnit value : values) {
            System.out.print("value = ");
            System.out.print(" / " + value);
        }

        System.out.println("\n\nHOURS = " + ChronoUnit.HOURS);
        System.out.println("HOURS.getDuration().getSeconds() = " + ChronoUnit.HOURS.getDuration().getSeconds());

        System.out.println("\nDAYS = " + ChronoUnit.DAYS);
        System.out.println("DAYS.getDuration().getSeconds() = " + ChronoUnit.DAYS.getDuration().getSeconds());

        LocalTime lt1 = LocalTime.of(1, 10, 0);
        LocalTime lt2 = LocalTime.of(1, 30, 0);

        long betweenS = ChronoUnit.SECONDS.between(lt1, lt2);
        System.out.println("\nbetween(20M)_By_SECONDS = " + betweenS);

        long betweenM = ChronoUnit.MINUTES.between(lt1, lt2);
        System.out.println("between(20M)_By_MINUTES = " + betweenM);
    }
}
