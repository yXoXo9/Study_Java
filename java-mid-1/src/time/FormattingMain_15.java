package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain_15 {
    public static void main(String[] args) {
        formatting_1();
        System.out.println();

        // 포맷팅
        LocalDateTime ldt = LocalDateTime.of(2033, 3, 14, 8, 42, 30);
        DateTimeFormatter formatter_yMdHms = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String withFormat = ldt.format(formatter_yMdHms);
        System.out.println("ISO_국제 표준 시간 출력 형태 ldt =\t" + ldt);
        System.out.println("with_yMdHms_Format = \t\t\t" + withFormat);

        // 파싱
        LocalDateTime parse = LocalDateTime.parse(withFormat, formatter_yMdHms);
        System.out.println("\n문자열 파싱(날짜와 시간) = " + parse);


    }

    private static void formatting_1() {
        // 포맷팅 : 날짜를 문자로 포맷을 바꾼다.
        LocalDate localDate = LocalDate.of(2024, 5, 14);
        System.out.println("\nISO 표준 입출력 형태 localDate = " + localDate);

        DateTimeFormatter customDateFormat_yyyyMMdd = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        String usedFormatterLdt = localDate.format(customDateFormat_yyyyMMdd);
        System.out.println("\nformatter(localDate) = " + usedFormatterLdt);

        // 파싱 : 문자를 날짜 타입으로 바꾼다.
        LocalDate parseDate = LocalDate.parse(usedFormatterLdt, customDateFormat_yyyyMMdd);
        System.out.println("\n(" + parseDate.getClass().getName() + ")_parseDate(StringDate, formatter) = " + parseDate);
    }
}
