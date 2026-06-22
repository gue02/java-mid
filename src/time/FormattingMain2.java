package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {
    public static void main(String[] args) {
        //포멧팅 : 날짜를 문자로
        LocalDateTime dateTime = LocalDateTime.of(2024,12,31,13,30,59);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String formattedDate = dateTime.format(formatter);
        System.out.println("formattedDate = " + formattedDate);

        //파싱 : 문자를 날짜로
        String input = "2030-01-01 11:30:00";
        LocalDate parsedDateTime = LocalDate.parse(input, formatter);
        System.out.println("parsedDate = " + parsedDateTime);
    }
}
