package time;

import java.time.temporal.ChronoField;

public class ChronoFieldMina_11 {
    public static void main(String[] args) {
        ChronoField[] values = ChronoField.values();
        for (ChronoField value : values) {
            System.out.println("v : " + value + "\t//\tvalue.range() 크로노필드 범위 = " + value.range());
        }

        System.out.println("\n\nChronoField.MONTH_OF_YEAR.range()\t 년의 최소-최대 범위 = " + ChronoField.MONTH_OF_YEAR.range());
        System.out.println("ChronoField.DAY_OF_MONTH.range()\t 달의(일) 최소-최대 범위 = " + ChronoField.DAY_OF_MONTH.range());

    }
}
