package vjzeba10;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Vjzeba10 {

    public static void main(String[] args) {

      LocalTime time1 = LocalTime.now();
      int number = 0;
      
        for (int i = 0; i < 1000; i++) {
            number++;
        }
        LocalTime time2 = LocalTime.now();
        Duration duration = Duration.between(time1, time2);
        double nano = duration.getNano();
        
        System.out.printf("This operation took %.4f seconds %n", nano/1000000000);

    }

}
