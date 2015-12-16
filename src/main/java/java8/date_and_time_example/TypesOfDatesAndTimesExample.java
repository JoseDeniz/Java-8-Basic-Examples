package java8.date_and_time_example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class TypesOfDatesAndTimesExample {

    public static void main(String[] args) {

        // A Date without time in the following format: yyyy-mm-dd
        LocalDate localDate = LocalDate.now();

        // A Time without a date in the following format: hh:mm:ss.ms
        LocalTime localTime = LocalTime.now();

        /*
         * Combines Date and Time (but still without any offset or time-zone)
         * in the following format: yyyy-mm-ddThh:mm:ss.ms
         * (is the concatenation of LocalDate + "T" + LocalTime)
         */
        LocalDateTime localDateTime = LocalDateTime.now();

        /*
         * A complete date-time with time-zone and resolved offset from UTC/Greenwich
         * an example of the format: 2015-09-11T18:35:10.194+01:00[Atlantic/Canary]
         */
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        System.out.printf("LocalDate: %s\n" +
                          "LocalTime: %s\n" +
                          "LocalDateTime: %s\n" +
                          "ZonedDateTime: %s",
                          localDate, localTime, localDateTime, zonedDateTime);

    }

}
