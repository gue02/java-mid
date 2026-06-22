package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalenderPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("년도를 입력하세요 : ");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.print("월을 입력하세요 : ");
        int month = scanner.nextInt();
        scanner.nextLine();

        printCalender(year,month);
    }

    public static void printCalender(int year, int month){
        LocalDate startDate = LocalDate.of(year,month,1);
        LocalDate nextStartDate = startDate.plusMonths(1);
        int offsetWeekDays = startDate.getDayOfWeek().getValue() % 7;

        System.out.println("Su Mo Tu We Th Fr Sa");
        for (int i = 0; i < offsetWeekDays; i++){
            System.out.print("   ");
        }

        LocalDate dayIterator = startDate;
        while(dayIterator.isBefore(nextStartDate)){
            System.out.printf("%2d ", dayIterator.getDayOfMonth());
            if(dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY){
                System.out.println();
            }
            dayIterator = dayIterator.plusDays(1);
        }
    }
}
