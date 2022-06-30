import java.time.*;
import java.time.temporal.ChronoUnit;

public class TimeDemo {
    public static void main(String[] args) {
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("current date and time: " + currentTime);

        LocalDate date1 = currentTime.toLocalDate();
        System.out.println("local date: " + date1);

        Month month = currentTime.getMonth();
        int day = currentTime.getDayOfMonth();
        int seconds = currentTime.getSecond();

        System.out.println(month + " " + day + " " + seconds);

        LocalDateTime date2 = currentTime.withMonth(7).withDayOfMonth(10).withYear(2012);
        System.out.println(date2);

        LocalDate date3 = LocalDate.of(2016, Month.DECEMBER, 25);
        System.out.println(date3);

        LocalTime date4 = LocalTime.of(19, 00);
        System.out.println(date4);

        LocalTime date5 = LocalTime.parse("20:15:30");
        System.out.println(date5);

        ZonedDateTime date6 = ZonedDateTime.parse("2016-04-20T19:22:15+01:30[Europe/Paris]");
        System.out.println(date6);

        ZoneId id = ZoneId.of("Asia/Kolkata");
        System.out.println("ZoneId: " + id);

        ZoneId currentZone = ZoneId.systemDefault();
        System.out.println("CurrentZone: " + currentZone);

        LocalDate today = LocalDate.now();
        System.out.println("Current date: " + today);

        LocalDate nextWeek = today.plus(2, ChronoUnit.WEEKS);
        System.out.println("two weeks after now: " + nextWeek);

        LocalDate nextMonth = today.plus(6, ChronoUnit.MONTHS);
        System.out.println("6 months after now: " + nextMonth);

        LocalDate nextYear = today.plus(5, ChronoUnit.YEARS);
        System.out.println("5 years after now: " + nextYear);

        LocalDate nextDecade = today.plus(2, ChronoUnit.DECADES);
        System.out.println("20 years after now: " + nextDecade);
    }
}
