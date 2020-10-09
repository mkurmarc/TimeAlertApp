package TimeAlertApp;

import com.sun.javaws.IconUtil;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class TimeAlertApp {

    public static void main(String[] args) {
        LocalTime startTime = LocalTime.of(18,39);
        LocalTime currentTime = LocalTime.now();
        long  elapsedTime = ChronoUnit.MINUTES.between(currentTime, startTime);

        if(elapsedTime > 0 && elapsedTime <= 30) {
            System.out.println("You have an event in " + elapsedTime + " minutes(s)!");
        }
        else if(elapsedTime <= 1) {
            System.out.println("Event started approximately " + (elapsedTime * -1) + " minute(s) ago!");
        }
    }

}
